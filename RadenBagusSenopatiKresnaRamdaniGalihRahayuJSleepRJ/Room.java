package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 * @kresnarmdn kapok
 * @cs 2
 */
public class Room extends Serializable
{
    /*public int size;
    public String name;
    public Facility facility;
    public Price price;
    
    public Room (String name, int size, Price price, Facility facility){
        this.name = name;
        this.size = size;
        this.price = price;
        this.facility = facility;
    }*/
    public int size;
    public Price price;
    public Facility facility;
    public String name;
    
    public Room(int id, String name, int size, Price price, Facility facility){
        super(id);
        this.name = name;
        this.size = size;
        this.price = price;
        this.facility = facility;
    }
}
