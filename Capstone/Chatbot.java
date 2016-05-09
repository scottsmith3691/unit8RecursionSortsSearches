import java.util.Scanner;
public class Chatbot
{
    private static String name;
    private String output;
    private String[] greetingsKeywords;
    private String[] answers;
    private static String in;
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
        in = input;
        String[] star = new String[] {"help", "fact", "date"};
        greetingsKeywords = new String[]{"hi", "hello", "what's up", "how are", "how r", 
            "hey", "sup", "suh", "whats up", "yo" };

        answers = new String[]{"good", "bad", "great", "horrible", "fine", 
            "nothing", "nothing much", "just chillin", "why"};

        //String[] answersResponses = new String[]{"great to hear", "oh no, im sorry", "awesome", "oh no, whats wrong",
        //"are you sure", "i feel ya", "thats cool", "nice"};

        if(in.indexOf("*")==0)
        {
            for(int x = 0; x < star.length; x++)
            {
                if(in.toLowerCase().indexOf(star[x])!=-1)
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
            return "";
        }
        else if(x==1)
        {
            return "Kangaroos can't hop backwards";
        }
        else if(x==2)
        {
            return "5/9/16";
        }
        return "";
    }

    public static String responses(int index)
    {
        String returnStr="";
        String[] intros= new String[]{"hi", "hello", "hey", "sup", "suh", "yo "};
        String[] introsResponses = new String[]{"hello human ", "hey there ", "hey buddy "};
        String[] feelings = new String[]{"good", "bad", "mad", "great", "terrific", "horrible"};
        if(index==0)

        {
            returnStr="";
            for(int i=0;i<intros.length;i++)
            {
                if(in.toLowerCase().indexOf(intros[i])!=-1)
                {
                    returnStr+= introsResponses[(int)(Math.random()*3)] + "";
                }
            }
            if(in.toLowerCase().indexOf("how")!= -1)
            {
                returnStr+=  feelings[(int) (Math.random()*5)]+ ", how about you " ;
            }

        }
        else if(index==1)
        {
            returnStr = "";
            if(in.toLowerCase().indexOf("good")!=-1 || in.toLowerCase().indexOf("great")!=-1)
            {
                returnStr += "great to hear ";
            }
            else if(in.toLowerCase().indexOf("bad")!=-1 || in.toLowerCase().indexOf("horrible")!=-1)
            {
                returnStr += "Oh no, Im sorry ";
            }
            else
            {
                returnStr+= "sweet ";
            }
            if(in.toLowerCase().indexOf("why")!=-1)
            {
                returnStr += "because I am talking to you";
            }
        }
        return returnStr;
    }

}
