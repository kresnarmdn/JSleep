package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 *
 * @kresnarmdn baru bangun ku terus ngoding
 * @PT 2
 * @updated PT 3
 * @updated CS 4
 * @updated PT 6
 */
public class Account extends Serializable /*implements FileParser*/
{
    public String name;
    public String email;
    public String password;
    final public static String REGEX_EMAIL = "[a-zA-Z0-9][@][a-zA-Z][.com]{9,12}";
    final public static String REGEX_PASSWORD = "[a-zA-Z0-9]{8,20}";
    
    public Account(String name, String email, String password){
        /*super(id);*/
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public String toString(){
        return "name = " + name + "\n" + "email = " + email + "\n" + "password = " + password + "\n";
    }
    
    /*public Object write(){
        return null;
    }*/
    
    public boolean read(String arr){
        return false;
    }

    /*public boolean validate{

    }*/
}
