package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 * @kresnarmdn mau turu
 * 
 */

import java.util.Date;
import java.lang.String;

public class JSleep
{
    public static void main(String[] args){
        Room RoomA = JSleep.createRoom();
        Room RoomB = JSleep.createRoom();
        System.out.println("Membuat booking dari tanggal 15 hingga 18");
        Date start = Date.valueOf("2022-8-15");
        Date end = Date.valueOf("2022-8-20");
        System.out.println(Payment.makeBooking(start, end,RoomA));
        System.out.println("Membuat booking dari tanggal 15 hingga 18");
        Date start2 = Date.valueOf("2022-8-18");
        Date end2 = Date.valueOf("2022-8-20");
        System.out.println(Payment.makeBooking(start2, end2,RoomA));
        System.out.println("Membuat booking dari tanggal 15 hingga 18 untuk kamar berbeda");
        Date start3 = Date.valueOf("2022-8-18");
        Date end3 = Date.valueOf("2022-8-20");
        System.out.println(Payment.makeBooking(start3, end3,RoomB));
        
        System.out.println("Membuat booking dari tanggal 20 hingga 15");
        Date start = Date.valueOf("2022-8-20");
        Date end = Date.valueOf("2022-8-15");
        System.out.println(Payment.makeBooking(start, end,RoomA));
    }
    
    /*public static void main(String[] args){
        Payment testPayment = new Payment(2, 2, 2,2);
        System.out.println(testPayment.getTime());
        System.out.println(testPayment.getDuration());
        Price[] unfilteredArray = new Price[5];
        
        for(int i=0;i < unfilteredArray.length;i++){
            int j = 5000;
            unfilteredArray[i] = new Price((i+1)*j);
        }
        System.out.println("Price List");
        for(int i=0;i < unfilteredArray.length;i++){
            System.out.println(unfilteredArray[i].price);
        }
        System.out.println("Below 12000.0");
        System.out.println(Validate.filter(unfilteredArray, 12000,true));
        System.out.println("Above 10000.0");
        System.out.println(Validate.filter(unfilteredArray, 10000,false));
    }*/
    
    /*public static void main(String[] args){
        Complaint testComplain = new Complaint(1, "23 August 2022", "Bad Quality");
        Price testPrice = new Price(100000, 20000);
        Room testRoom = new Room(1, "Presidential Suite", 5, testPrice,
        Facility.FitnessCenter, City.DEPOK, "JL. Margonda Raya");
        Account testAccount = new Account(1, "Bob", "bob@gmail.com", "bob");
        Rating testRating = new Rating();
        System.out.println(testComplain.toString());
        System.out.println(testRoom.toString());
        System.out.println(testAccount.toString());
        System.out.println(testPrice.toString());
        System.out.println(testRating.toString());        
    }*/
    
    
    /*
    public int getHotelId(){
        return 0;
    }
    
    public String getHotelName(){
        return "hotel";
    }
    
    public boolean isDiscount(){
        return true;
    }
    
    public float getDiscountPercentage(int beforeDiscount,int afterDiscount){
        if (beforeDiscount <= afterDiscount){
            return 0;
        }

        else{
            float percentage = (beforeDiscount - afterDiscount) / beforeDiscount * 100;
            return percentage;
        }
    }
    
    public static int getDiscountedPrice(int price,float discountPercentage){
        if(discountPercentage > 100){
            discountPercentage = 100;
        }
        
        float discountPrice = (discountPercentage * price)/100;
        float afterDiscount = price - discountPrice;
        return (int)afterDiscount;
    }
    
    public static int getOriginalPrice(int discountedPrice,float discountPercentage){
        if (discountedPrice == 0){
            return 0;
        }
        
        if (discountPercentage == 0){
            return discountedPrice;
        }
        
        float original = ((float)discountedPrice/(1 - (discountPercentage/100)));
        return (int) original;
    }
    
    public static float getAdminFeePercentage(){
        return 0.05f;
    }
    
    public static int getAdminFee(int price){
        return (int)(price * getAdminFeePercentage());
    }
    
    public static int getTotalPrice(int price,int numberOfNight){
        int Total = (price * numberOfNight) + getAdminFee(price * numberOfNight);
        return Total;
    }
    
    public static void main(String[] args){
        Room test = createRoom();
        
        System.out.println(test.name);
        System.out.println(test.size);
        System.out.println(test.price.price);
        System.out.println(test.facility);
    }*/
    
    /*public static void main(String[] args){
        Payment testRoom = new Payment(1, 1, 1, "", 1, "", "");
        Invoice testInvoice = new Invoice(2, 2, 2, "");
        System.out.println(testRoom.print());
        System.out.println(testInvoice.print());
    }*/
    
    public static Room createRoom(){
        Price price = new Price (500000, 10);
        Room room = new Room (1, "hotel", 20, price, Facility.AC, City.DEPOK, "Jl. yang disakiti");
        return room;
    }
}
