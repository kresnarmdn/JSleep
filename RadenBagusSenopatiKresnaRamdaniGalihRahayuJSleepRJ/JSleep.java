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
        float percentage = (beforeDiscount - afterDiscount) / beforeDiscount;
        return percentage;
    }
    public float getDiscountedPrice(float price,float discountPercentage){
        float finalprice = price - (price * discountPercentage);
        return finalprice;
    }
    public float getOriginalPrice(float discountedPrice,float discountPercentage){
        float original = discountedPrice + (discountPercentage / discountedPrice);
        return original;
    }
    public float getAdminFeePercentage(){
        return 0.05f;
    }
    public float getAdminFee(float price,float getAdminFeePercentage){
        float adminprice = price * getAdminFeePercentage;
        return adminprice;
    }
    public int getTotalPrice(int price,int numberOfNight){
        int Total = price * numberOfNight;
        return Total;
    }
}
