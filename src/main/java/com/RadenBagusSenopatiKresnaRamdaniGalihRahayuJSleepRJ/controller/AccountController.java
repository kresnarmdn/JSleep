package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.controller;

import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.Algorithm;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.JsonTable;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Account;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Renter;
import org.springframework.web.bind.annotation.*;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.JsonAutowired;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    @PostMapping("/account/login")
    Account login(@RequestParam String email, @RequestParam String password){
        String enc = null;
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] Byte = md.digest(password.getBytes());
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < Byte.length; i++){
                builder.append(Integer.toString((Byte[i] & 0xff) + 0x100, 16).substring(1));
            }
            enc = builder.toString();
        }
        catch (NoSuchAlgorithmException t) {
            t.printStackTrace();
        }
        String encrypted = enc;
        Account acc = Algorithm.<Account>find(accountTable, pred -> pred.email == email & pred.password == password);
        if (acc != null || encrypted == acc.password){
            return acc;
        }
        else{
            return null;
        }
    }

    @PostMapping("/account/register")
    Account register
            (
                    @RequestParam String name,
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        Pattern Mail = Pattern.compile(REGEX_EMAIL);
        Pattern Pass = Pattern.compile(REGEX_PASSWORD);

        Matcher matcherMail = Mail.matcher(email);
        Matcher matcherPass = Pass.matcher(password);

        boolean match1 = matcherMail.find();
        boolean match2 = matcherPass.find();

        if (!name.isBlank() && match1 && match2){
            String enc = null;
            try{
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] Byte = md.digest(password.getBytes());
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < Byte.length; i++){
                    builder.append(Integer.toString((Byte[i] & 0xff) + 0x100, 16).substring(1));
                }
                enc = builder.toString();
            }
            catch (NoSuchAlgorithmException t){
                t.printStackTrace();
            }
            String encrypted = enc;
            return new Account(name, email, encrypted);
        }
        else{
            return null;
        }
    }

    @PostMapping("/account/{id}/registerRenter")
    String registerRenter
            (
                    @PathVariable int id,
                    @RequestParam String username,
                    @RequestParam String address,
                    @RequestParam String phoneNumber
            )
    {
        Account acc = Algorithm.<Account>find(accountTable, pred -> id == pred.id);
        if (acc.renter == null){
            acc.renter = new Renter(username, address, phoneNumber).toString();
            return acc.renter;
        }
        else{
            return null;
        }
    }

    @Override
    public JsonTable<Account> getJsonTable() {
        return accountTable;
    }

    //@GetMapping("/{id}")
    //public String getById(@PathVariable int id) {
    //    return "account id " + id + " not found!";
    //}


    @PostMapping("/account/{id}/topUp")
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
