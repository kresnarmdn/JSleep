package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * 
 *
 * @kresnarmdn tutorial mati muda
 * @CS 3
 */
public class Payment extends Invoice
{
    public String to;
    public String from;
    private int roomId;
    
    public Payment(int id, Account buyer, Renter renter, String time, int roomId, String from, String to){
        super(id, buyer, renter, time);
        this.roomId = roomId;
        this.from = from;
        this.to = to;
    }
    
    public Payment(int id, int buyerId, int renterId, String time, int roomId, String from, String to){
        super(id, buyerId, renterId, time);
        this.roomId = roomId;
        this.from = from;
        this.to = to;
    }
    
    public String print(){
        return "id = " + id + "\n" + "buyerId = " + buyerId + "\n" + "time = " + time + "\n" + "roomId = " + roomId + "\n" + "from = " + from + "\n" + "to = " + to +"\n";
    }
    
    public int getRoomId(){
        return roomId;
    }
}
