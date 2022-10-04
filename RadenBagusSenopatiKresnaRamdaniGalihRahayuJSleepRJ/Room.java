package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 * @kresnarmdn kapok
 * @CS 2
 * @updated CS 3
 * @updated PT 3
 * @updated CS 4
 */
public class Room extends Serializable implements FileParser
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
    
    public Room(int id, String name, int size, Price price, Facility facility, City city, String address){
        super(id);
        this.name = name;
        this.size = size;
        this.price = price;
        this.facility = facility;
        this.city = city;
        this.address = address;
    }
    
    public String toString(){
        return "name = " + name + "\n" + "size = " + size + "\n" + price + "\n" + "city = " + city + "\n" + "facility = " + facility + "\n";
    }
    
    public Object write(){
        return null;
    }
    
    public boolean read(String arr){
        return false;
    }
}
