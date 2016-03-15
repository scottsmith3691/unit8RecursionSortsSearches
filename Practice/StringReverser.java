public class StringReverser
{
    
    public static String reverse( String text )
    {
        if(text.length() == 0)
        {
            return "";
            
        }
        char c = text.charAt(0);
        String rest = text.substring(1);
        String reverseText = reverse(rest) + c;
        return reverseText;
    }
    
    public static String rreverseIter( String text)
    {
        String reverseText = "";
        for( int i = text.length()-1;i>=0; i--)
        {
            char c = text.charAt(i);
            reverseText = reverseText+c;
        }
        return reverseText;
    }
    
    public static void main(String[] args)
    {
        System.out.println(StringReverser.reverse("Hello!"));
        System.out.println( "Expected: !olleH");
        System.out.println( StringReverser.reverse("Odd"));
        System.out.println( "Expected: ddO");
    }
}