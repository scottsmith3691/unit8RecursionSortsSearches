import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>(n);
      if (n <= 0)  // The smallest list we can make
      {
            tempList.add(n-1, n);
            return n;

      }
      else        // All other size lists are created here
      {
          tempList.add(n-1, n);
          tempList.add(n-1, makeList(n-1));
          
      }
      return tempList;
   }
}