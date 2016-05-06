import java.util.Scanner;







public class Chatbot
{
    private static String name;
    private String output;
    
    
    public Chatbot(String n)
    {
        name = n;
        System.out.println("Hello " + name + ", welcome to ChatBot 2.0");
        
        
        
    }
    
    public void beginTalk()
    {
        Scanner s = new Scanner(System.in);
        
        
        
        output = "s";
        while( output != "" || output != "exit")
        {
            System.out.print(name+ ": ");
            String input = s.nextLine();
            System.out.println("ChatBot: " + this.getKeywords(input));
            
            
            
            
            
            

        }
        
    }
    
    public String getKeywords(String input)
        {
            String in = input;
            
            
            String[] star = new String[] {"help", "fact", "date"};
            
            
            
            
            String[] greetingsKeywords = new String[]{"hi", "hello", "what's up", "how are", "how r", 
            "hey", "sup", "suh", "whats up", "yo" };
            
            
            
            //String[] greetingResponses = new String[]{"hey", "hello human", "nothing how about you", "im great hbu",
            //"im good", "hey there", "sup fam", "suh dude"};
            
            
            
            String[] answers = new String[]{"im good", "im bad", "im great", "im horrible", "im fine", 
            "nothing", "nothing much", "just chillin"};
            
            
            
            //String[] answersResponses = new String[]{"great to hear", "oh no, im sorry", "awesome", "oh no, whats wrong",
            //"are you sure", "i feel ya", "thats cool", "nice"};
            
            
            
            
            //statements[]
            //questions[]
            if(in.toLowerCase().indexOf("*")==0)
            {
                 for(int x = 0; x < star.length; x++)
                 {
                     if(in.toLowerCase().indexOf(x)!=-1)
                     {
                         String out = special(x);
                         return out;
                     }
                 }
            }
            
            for(int i = 0; i<greetingsKeywords.length; i++)
            
            {
                if(in.toLowerCase().indexOf(greetingsKeywords[i])!= -1)
                
                {
                    
                    String response = responses(0);
                    return response;
                    
                    
                }
            }
            for(int y =0; y<answers.length;y++)
            {
                if(in.indexOf(answers[y])!= -1)
                
                {
                    String response1 = responses(1);
                    return response1;
                    
                    
                }
            }
            
            return "what?";
        }
        
    public static String special(int x)
    {
        if(x==0)
        {
            return "Kangaroos can't hop backwards";
        }
        else if(x==1)
        {
            return "";
        }
        else if(x==2)
        {
            return "5/6/16";
        }
        return "";
    }
    
    public static String responses(int index)
    {
        if(index==0)
        
       {
           
        }
        else if(index==1)
        {
            
        }
        return "";
    }

    
}
