package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.controller;

import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.JsonTable;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.JsonAutowired;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Voucher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class VoucherController implements BasicGetController<Voucher>{

    @JsonAutowired(value = Voucher.class, filepath ="src/json.account")
    public static JsonTable<Voucher> voucherTable;

    @Override
    public JsonTable<Voucher> getJsonTable(){
        return voucherTable;
    }

    /*@GetMapping("/voucher/{id}/isUsed")
    boolean isUsed(@PathVariable int id){

    }

    @GetMapping("/voucher/{id}/canApply")
    boolean canApply(@PathVariable int id, @RequestParam double price){

    }

    @GetMapping("/voucher/getAvailable")
    List<Voucher> getAvailable(@RequestParam int page, @RequestParam int pageSize){

    }*/
}
