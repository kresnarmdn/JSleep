package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.controller;

import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.JsonTable;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.JsonAutowired;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class PaymentController implements BasicGetController<Payment>{

    @JsonAutowired(value = Payment.class, filepath ="src/json.account")
    public static JsonTable<Payment> paymentTable;

    @Override
    public JsonTable<Payment> getJsonTable(){
        return paymentTable;
    }

    /*@PostMapping("/payment/create")
    public Payment create(@RequestParam int buyerId, @RequestParam int renterId, @RequestParam int roomId,
                          @RequestParam String from, @RequestParam String to){

    }

    @PostMapping("/payment/{id}/accept")
    boolean accept(@RequestParam int id){

    }

    @PostMapping("/payment/{id}/cancel")
    boolean cancel(@RequestParam int id){

    }*/
}
