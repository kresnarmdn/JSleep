package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * Write a description of class Validate here.
 *
 * @kresnarmdn pusing masuk array
 * @CS 4
 */

import java.util.ArrayList;

public class Validate
{
    public static ArrayList filter(Price[] list, int value, boolean less){
        ArrayList<Price> result = new ArrayList<Price>();
        for (Price price: list){
            if (less) {
                if (price.price <= value){
                    result.add(price);
                }
            }
            else{
                if (price.price >= value){
                    result.add(price);
                }
            }
        }
        return result;
    }
}