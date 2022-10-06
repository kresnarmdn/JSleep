package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * 
 *
 * @kresnarmdn tutorial mati muda
 * @CS 3
 * @updated CS 4
 * @updated PT 4
 */

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment extends Invoice
{
    public Date to;
    public Date from;
    private int roomId;
    
    public Payment(int id, Account buyer, Renter renter, int roomId, Date from, Date to){
        super(id, buyer, renter);
        this.roomId = roomId;
        this.from = new Date();
        this.to = new Date();
    }
    
    public Payment(int id, int buyerId, int renterId, int roomId, Date from, Date to){
        super(id, buyerId, renterId);
        this.roomId = roomId;
        this.from = new Date();
        this.to = new Date();
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
    
    /*public String getDuration(){
        SimpleDateFormat formattime = new SimpleDateFormat("dd MMMM yyyy");
        String datefrom = formattime.format(this.from.getTime());
        String dateto = formattime.format(this.from.getTime());
        return datefrom + " - " + dateto;
    }*/
    
    public static boolean makeBooking(Date from, Date to, Room room){
        SimpleDateFormat formattime = new SimpleDateFormat("dd MMMM yyyy");
        String datefrom = formattime.format(from.getTime());
        String dateto = formattime.format(from.getTime());
        Calendar cal = Calendar.getInstance();
        
        if (availability(from, to, room)){
            while(from.before(to)){
                room.booked.add(from);
                cal.setTime(from);
                cal.add(Calendar.DATE, 1);
                from = cal.getTime();
            }
            return true;
        }
        
        else{
            return false;
        }
    }
    
    public static boolean availability(Date from, Date to, Room room){
        if(room.booked.isEmpty()){
            return true;
        }
        
        if(to.before(from)){
            return false;
        }
        
        for(Date i : room.booked){
            if(i.after(from) && i.before(to) || i.equals(from)){
                return false;
            }
        }
        
        return true;
    }
}
