package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * 
 *
 * @kresnarmdn tutorial mati muda
 * @CS 3
 * @updated CS 4
 */

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Payment extends Invoice
{
    public Calendar to = Calendar.getInstance();
    public Calendar from = Calendar.getInstance();
    private int roomId;
    
    public Payment(int id, Account buyer, Renter renter, int roomId){
        super(id, buyer, renter);
        this.roomId = roomId;
        this.to.add(Calendar.DATE, 2);
    }
    
    public Payment(int id, int buyerId, int renterId, int roomId){
        super(id, buyerId, renterId);
        this.roomId = roomId;
        this.to.add(Calendar.DATE, 2);
    }
    
    public String print(){
        return "id = " + id + "\n" + "buyerId = " + buyerId + "\n" + "time = " + time + "\n" + "roomId = " + roomId + "\n" + "from = " + from + "\n" + "to = " + to +"\n";
    }
    
    public int getRoomId(){
        return roomId;
    }
    
    public String getTime(){
        SimpleDateFormat formattime = new SimpleDateFormat("dd MMMM yyyy");
        String formated = formattime.format(this.from.getTime());
        return "Date = " + formated;
    }
    
    public String getDuration(){
        SimpleDateFormat formattime = new SimpleDateFormat("dd MMMM yyyy");
        String datefrom = formattime.format(this.from.getTime());
        String dateto = formattime.format(this.from.getTime());
        return datefrom + " - " + dateto;
    }
    
}
