package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * 
 *
 * @kresnarmdn tp jarkom banyak bener
 * @CS 3
 */
public class Invoice extends Serializable
{
    public int buyerId;
    public int renterId;
    public String time;
    
    protected Invoice(int id, int buyerId, int renterId, String time){
        super(id);
        this.buyerId = buyerId;
        this.renterId = renterId;
        this.time = time;
    }
    
    public Invoice(int id, Account buyer, Renter renter, String time){
        super(id);
        this.buyerId = buyer.id;
        this.renterId = renter.id;
        this.time = time;
    }
    
    public String print(){
        return "buyerId = " + buyerId + "\n" + "renterId = " + renterId + "\n" + "time = " + time + "\n";
    }
}