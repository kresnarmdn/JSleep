package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.controller;

import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.Algorithm;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.JsonTable;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.Price;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.JsonAutowired;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Voucher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class VoucherController implements BasicGetController<Voucher>{

    @JsonAutowired(value = Voucher.class, filepath ="src/json.account")
    public static JsonTable<Voucher> voucherTable;

    @Override
    public JsonTable<Voucher> getJsonTable(){
        return voucherTable;
    }

    @GetMapping("/voucher/{id}/isUsed")
    boolean isUsed(@PathVariable int id){
        Voucher used = Algorithm.<Voucher>find(voucherTable, pred -> pred.id == id);
        return used.isUsed();
    }

    @GetMapping("/voucher/{id}/canApply")
    boolean canApply(@PathVariable int id, @RequestParam double price){
        Voucher apply = Algorithm.<Voucher>find(voucherTable, pred -> pred.id == id);
        Price harga = new Price(price);
        return apply.canApply(harga);
    }

    @GetMapping("/voucher/getAvailable")
    List<Voucher> getAvailable(@RequestParam int page, @RequestParam int pageSize){
        List<Voucher> voucher = new ArrayList<Voucher>();
        return Algorithm.<Voucher>paginate(voucher, page, pageSize, pred -> true);
    }
}
