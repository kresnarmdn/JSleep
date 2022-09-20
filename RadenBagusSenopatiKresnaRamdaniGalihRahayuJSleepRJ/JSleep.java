package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 * @kresnarmdn mau turu
 * 
 */
public class JSleep
{/*
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
    }*/
    
    public static void main(String[] args){
        Room test = createRoom();
        
        System.out.println(test.name);
        System.out.println(test.size);
        System.out.println(test.price.price);
        System.out.println(test.facility);
    }
    
    public static Room createRoom(){
        Price price = new Price (500000, 10);
        Room room = new Room ("hotel", 20, price, Facility.AC);
        return room;
    }
}
