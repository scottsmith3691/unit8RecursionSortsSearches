import java.net.URL;
import java.util.Scanner;
/**
 * Write a description of class WC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WC
{


    /**
     * Default constructor for objects of class WC
     */
    public WC() 
    {
        try
        {
            String address = "http://www/naperville203.org/nnhs";
            URL pageLoc = new URL(address);
            Scanner in = new Scanner(pageLoc.openStream());
        }
        
        catch (Exception FileNotFoundException)
        {
            System.out.println("Error, not a file");
        }
    }

}
