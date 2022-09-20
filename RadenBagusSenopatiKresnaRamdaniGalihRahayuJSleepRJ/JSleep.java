package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * Write a description of class JSleep here.
 *
 * @kresnarmdn mau turu
 * 
 */
public class JSleep
{
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
        float percentage = (beforeDiscount - afterDiscount) / beforeDiscount * 100;
        return percentage;
    }
    public static int getDiscountedPrice(int price,float discountPercentage){
        float discountPrice = (discountPercentage * price)/100;
        float afterDiscount = price - discountPrice;
        return (int)afterDiscount;
    }
    public static int getOriginalPrice(int discountedPrice,float discountPercentage){
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
}
