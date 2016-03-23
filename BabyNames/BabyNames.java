import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   public static final double LIMIT = 50;

   public static void main(String[] args) throws FileNotFoundException
   {  
      
      try
      {
      Scanner in = new Scanner(System.in);
      System.out.println("File:");
      String file1 = in.next();
      File f = new File(file1) ;
      RecordReader boys = new RecordReader(LIMIT);
      RecordReader girls = new RecordReader(LIMIT);
      
      while (boys.hasMore() || girls.hasMore())
      {
         int rank = in.nextInt();
         System.out.print(rank + " ");
         boys.process(in);
         girls.process(in);
         System.out.println();
      }

      in.close();
    }
    catch (Exception FileNotFoundException)
    {
        System.out.println("File not found");
    }
   }
}	
