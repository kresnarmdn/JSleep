package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 * @kresnarmdn kapok
 * @CS 2
 * @updated CS 3
 * @updated PT 3
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
    public String address;
    public Facility facility;
    public BedType bedType;
    public City city;
    public String name;
    
    public Room(int id, String name, int size, Price price, City city, Facility facility){
        super(id);
        this.name = name;
        this.size = size;
        this.price = price;
        this.city = city;
        this.facility = facility;
    }
    
    public String toString(){
        return "name = " + name + "\n" + "size = " + size + "\n" + "price = " + price + "\n" + "city = " + city + "\n" + "facility = " + facility + "\n";
    }
}
