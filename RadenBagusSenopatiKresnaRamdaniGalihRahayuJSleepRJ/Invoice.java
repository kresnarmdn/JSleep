package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * 
 *
 * @kresnarmdn tp jarkom banyak bener
 * @CS 3
 * @updated PT 3
 * @updated CS 4
 */

import java.util.Calendar;

public class Invoice extends Serializable
{
    public int buyerId;
    public int renterId;
    public Calendar time = Calendar.getInstance();
    public PaymentStatus status = PaymentStatus.WAITING;
    public RoomRating rating = RoomRating.NONE;
    
    public enum RoomRating {
        NONE, BAD, NEUTRAL, GOOD;
    }
    
    public enum PaymentStatus {
        FAILED, WAITING, SUCCESS;
    }
    
    protected Invoice(int id, int buyerId, int renterId){
        super(id);
        this.buyerId = buyerId;
        this.renterId = renterId;
    }
    
    public Invoice(int id, Account buyer, Renter renter){
        super(id);
        this.buyerId = buyer.id;
        this.renterId = renter.id;
    }
    
    public String print(){
        return "buyerId = " + buyerId + "\n" + "renterId = " + renterId + "\n" + "time = " + time + "\n";
    }
}
