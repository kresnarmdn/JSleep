package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * 
 *
 * @kresnarmdn baru tau tekkom nguli
 * @CS 3
 * @updated CS 6
 */
public class Renter extends Serializable
{
    final public static String REGEX_NAME = "^[A-Z][a-zA-z0-9_]{4,20}$";
    public String phoneNumber;
    public String address = "";
    public String username;
    final public static String REGEX_PHONE = "[0-9]{9,12}";

    public Renter(String username, String phoneNumber, String address){
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public boolean validate(){
        return this.username.matches(REGEX_NAME) && this.phoneNumber.matches(REGEX_PHONE);
    }
    
    
    /*public Renter(int id, String username, int phoneNumber){
        super(id);
        this.username = username;
        this.phoneNumber = phoneNumber;
    }
    
    public Renter(int id, String username){
        super(id);
        this.username = username;
    }
    
    public Renter(int id, String username, String address){
        super(id);
        this.username = username;
        this.address = address;
    }
    
    public Renter(int id, String username, int phoneNumber, String address){
        super(id);
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }*/
}
