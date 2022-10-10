package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * 
 *
 * @kresnarmdn abis ide nama
 * @PT 2
 * @updated CS 4
 */
public class Voucher extends Serializable implements FileParser
{
    public Type type;
    public double cut;
    public String name;
    public int code;
    public double minimum;
    private boolean used;
    
    public Voucher(int id, String name, int code, Type type, boolean used, double minimum, double cut){
        super(id);
        this.name = name;
        this.code = code;
        this.type = type;
        this.minimum = minimum;
        this.cut = cut;
    }
    
    public boolean canApply(Price price){
        if(price.price > this.minimum && this.used == false){
            return true;
        }
        
        else{
            return false;
        }
    }
    
    public double apply(Price price){
        this.used = true;
        
        if(this.type == Type.DISCOUNT){
            return price.price - (price.price * (100 - cut)/100);
        }
        
        else{
            return price.price - this.cut;
        }
    }
    
    public boolean isUsed(){
        return this.used;
    }
    
    public Object write(){
        return null;
    }
    
    public boolean read(String arr){
        return false;
    }
}
