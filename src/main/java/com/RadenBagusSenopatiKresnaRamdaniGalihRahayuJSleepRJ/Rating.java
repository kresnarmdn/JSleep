package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 * @kresnarmdn pusing
 * @cs 2
 */

public class Rating
{
    private long total;
    private long count;
    
    public Rating()
    {
        this.total = 0;
        this.count = 0;
    }

    public void insert(int rating){
        this.total += rating;
        this.count++;
    }
    
    public long getCount(){
        return this.count;
    }
    
    public long getTotal(){
        return this.total;
    }
    
    public double getAverage(){
        if (count == 0){
            return 0;
        }
        else {
            return total / count;
        }
    }
    
    public String toString(){
        return "Total = " + total + "\n";
    }
}
