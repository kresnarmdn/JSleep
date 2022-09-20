package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 * @kresnarmdn minta tolong
 * @cs 2
 */
public class Price
{
    public double rebate;
    public double price;
    public int discount;
    
    public Price(double price, int discount){
        this.price = price;
        this.discount = discount;
        this.rebate = 0;
    }
    
    public Price(double price){
        this.discount = 0;
        this.rebate = 0;
        this.price = price;
    }
    
    public Price(double price, double rebate){
        this.price = price;
        this.rebate = rebate;
        this.discount = 0;
    }
    
    private double getDiscountedPrice(){
        if (discount > 100.0){
            return 0;
        }
        if (discount == 100.0){
            return 0;
        }
        
        return price - (price * discount / 100);
    }
    
    private double getRebatedPrice(){
        if (rebate > price){
            return this.price;
        }
        
        return price - rebate;
    }
}
