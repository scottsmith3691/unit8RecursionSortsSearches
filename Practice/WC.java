import java.net.*;
import java.io.File;
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
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter File: ");
        String fileN = s.next();
        File inputFile = new File(fileN);
        
        try
        {
            
            Scanner in = new Scanner(inputFile);
            
            while(in.hasNext())
            {
                System.out.println(in.next());
            }
        }
        
        catch (Exception FileNotFoundException)
        {
            System.out.println("Error, not a file");
        }
    }

}
