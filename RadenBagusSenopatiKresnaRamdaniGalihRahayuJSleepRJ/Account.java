package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;


/**
 *
 *
 * @kresnarmdn baru bangun ku terus ngoding
 * @PT 2
 * @updated PT 3
 */
public class Account extends Serializable
{
    public String name;
    public String email;
    public String password;
    
    public Account(int id, String name, String email, String password){
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public String toString(){
        return "name = " + name + "\n" + "email = " + email + "\n" + "password = " + password + "\n";
    }
}
