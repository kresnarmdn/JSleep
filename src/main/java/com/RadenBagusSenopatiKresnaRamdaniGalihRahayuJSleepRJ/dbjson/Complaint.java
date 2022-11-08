package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson;


import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Serializable;

/**
 * 
 *
 * @kresnarmdn pulang pulang ku terus nguli
 * @PT 3
 */
public class Complaint extends Serializable
{
    public String desc;
    public String date;
    
    public Complaint(String date, String desc){
        this.date = date;
        this.desc = desc;
    }
    
    public String toString(){
        return "date = " + date + "\n" + "desc = " + desc + "\n";
    }
}
