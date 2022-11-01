package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * Write a description of class Validate here.
 *
 * @kresnarmdn pusing masuk array
 * @CS 4
 * @updated CS 6
 */

import java.util.ArrayList;

public class Validate
{
    public static ArrayList filter(Price[] list, int value, boolean less){
        ArrayList filteredPrice = new ArrayList();
        if(less == true) {
            for (Price iterator : list) {
                if(iterator.price <= value){
                    filteredPrice.add(iterator.price);
                }
            }
        }
        else{
            for (Price iterator : list) {
                if(iterator.price > value){
                    filteredPrice.add(iterator.price);
                }
            }
        }
        return filteredPrice;
    }
}