package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.controller;

import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.Algorithm;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.JsonTable;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Account;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Renter;
import org.springframework.web.bind.annotation.*;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.JsonAutowired;

// TODO sesuaikan dengan package Anda: package com.netlabJSleepGS.controller;


// TODO sesuaikan dengan package Anda: import com.netlabJSleepGS.Account;


@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{
    @JsonAutowired(value = Account.class, filepath ="src/json.account")
    public static JsonTable<Account> accountTable;
    final public static String REGEX_EMAIL = "^[a-zA-Z0-9]+@[a-zA-Z]+([.]?[A-Za-z]+)*\\\\.[A-Za-z]+$";
    final public static String REGEX_PASSWORD = "^(?=.*a-z)(?=.*A-Z)(?=.*0-9)[a-zA-Z0-9]{8,}$";
    final public static String REGEX_PATTERN_EMAIL = "^[a-zA-Z0-9]+@[a-zA-Z]+([.]?[A-Za-z]+)*\\\\.[A-Za-z]+$";
    final public static String REGEX_PATTERN_PASSWORD = "^(?=.*a-z)(?=.*A-Z)(?=.*0-9)[a-zA-Z0-9]{8,}$";

    @GetMapping
    String index() { return "account page"; }

    @PostMapping("account/login")
    Account login(@RequestParam String email, @RequestParam String password){
        return Algorithm.<Account>find(accountTable, acc-> acc.email==email & acc.password == password);
    }

    @PostMapping("account/register")
    Account register
            (
                    @RequestParam String name,
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        return new Account(name, email, password);
    }

    @PostMapping("account/{id}/registerRenter")
    Renter registerRenter
            (
                    @PathVariable int id,
                    @RequestParam String username,
                    @RequestParam String address,
                    @RequestParam String phoneNumber
            )
    {
        return null;
    }

    @Override
    public JsonTable<Account> getJsonTable() {
        return accountTable;
    }

    //@GetMapping("/{id}")
    //public String getById(@PathVariable int id) {
    //    return "account id " + id + " not found!";
    //}


    @PostMapping("account/{id}/topUp")
    boolean topUp
            (
                @PathVariable int id,
                @RequestParam double balance
            )
    {
        for (Account acc : accountTable){
            if(acc.id == id){
                balance = balance + balance;
                return true;
            }
        }
        return false;
    }
}
