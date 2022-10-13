package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 * 
 *
 * @kresnarmdn bingung knp ga nyambung
 * @CS 3
 * @updated CS 4
 */

import java.util.HashMap;

public class Serializable
{
    public final int id;

    private static HashMap<Class<?>, Integer> mapCounter;

    protected Serializable(int id){
        if(mapCounter.get(getClass()) != null){
            this.id = (mapCounter.get(getClass()) + 1);
        }
        else{
            this.id = 0;
        }
    }

    public int compareTo(Serializable comp){
        Integer newId = this.id;
        return newId.compareTo(comp.id);
    }

    public boolean equals(Object comp){
        if(((((Serializable)comp).id) == this.id) && (comp instanceof Serializable)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean equals(Serializable comp){
        if(this.id == comp.id){
            return true;
        }
        else {
            return false;
        }
    }

    public static Integer getClosingId(Class<?> key){
        return mapCounter.get(key);
    }

    public static Integer setClosingId(Class<?> key, int value){
        return mapCounter.put(key, value);
    }
}
