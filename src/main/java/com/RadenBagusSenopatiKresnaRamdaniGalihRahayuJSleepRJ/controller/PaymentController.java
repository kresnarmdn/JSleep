package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.controller;

import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.Algorithm;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.JsonTable;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class PaymentController implements BasicGetController<Payment>{

    @JsonAutowired(value = Payment.class, filepath ="src/json.account")
    public static JsonTable<Payment> paymentTable;

    @Override
    public JsonTable<Payment> getJsonTable(){
        return paymentTable;
    }

    @PostMapping("/payment/create")
    public Payment create(@RequestParam int buyerId, @RequestParam int renterId, @RequestParam int roomId,
                          @RequestParam String from, @RequestParam String to) throws ParseException {
        Account acc = Algorithm.<Account>find(new AccountController().getJsonTable(), pred -> pred.id == buyerId);
        Room room = Algorithm.<Room>find(new RoomController().getJsonTable(), pred -> pred.id == roomId);
        double total = room.price.price;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fromDate = sdf.parse(from);
        Date toDate = sdf.parse(to);

        if (acc != null && room != null && acc.balance >= total && Payment.availability(fromDate, toDate, room)){
            Payment payment = new Payment(buyerId, renterId, roomId, fromDate, toDate);
            acc.balance = room.price.price - acc.balance;
            payment.status = Invoice.PaymentStatus.WAITING;
            Payment.makeBooking(fromDate, toDate, room);
            paymentTable.add(payment);

            return payment;
        }
        else{
            return null;
        }
    }

    @PostMapping("/payment/{id}/accept")
    boolean accept(@RequestParam int id){
        Payment payment = Algorithm.<Payment>find(paymentTable, pred -> pred.id == id);
        if (payment != null && payment.status == Invoice.PaymentStatus.WAITING){
            payment.status = Invoice.PaymentStatus.SUCCESS;

            return true;
        }
        else{
            return false;
        }
    }

    @PostMapping("/payment/{id}/cancel")
    boolean cancel(@RequestParam int id){
        Payment payment = Algorithm.<Payment>find(paymentTable, pred -> pred.id == id);
        if (payment != null && payment.status == Invoice.PaymentStatus.WAITING){
            Account acc = Algorithm.<Account>find(AccountController.accountTable, buyer->buyer.id == payment.buyerId);
            Room room = Algorithm.<Room>find(RoomController.roomTable, pred -> pred.id == payment.getRoomId());
            payment.status = Invoice.PaymentStatus.FAILED;
            acc.balance = room.price.price + acc.balance;

            return true;
        }
        else{
            return false;
        }
    }
}
