package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson;


/**
 * 
 *
 * @kresnarmdn tp jarkom banyak bener
 * @CS 3
 * @updated PT 3
 * @updated CS 4
 * @updated PT 4
 */

/*import java.util.Calendar;*/

/*import java.util.Date;*/

public class Invoice extends Serializable
{
    public int buyerId;
    public int renterId;
    /*public Date time = new Date();*/
    public PaymentStatus status = PaymentStatus.WAITING;
    public RoomRating rating = RoomRating.NONE;
    
    public enum RoomRating {
        NONE, BAD, NEUTRAL, GOOD;
    }
    
    public enum PaymentStatus {
        FAILED, WAITING, SUCCESS;
    }
    
    protected Invoice(int buyerId, int renterId){
        this.buyerId = buyerId;
        this.renterId = renterId;
    }
    
    public Invoice(Account buyer, Renter renter){
        this.buyerId = buyer.id;
        this.renterId = renter.id;
    }
    
    public String print(){
        return "buyerId = " + buyerId + "\n" + "renterId = " + renterId + "\n" /*+ "time = " + time + "\n"*/;
    }
}
