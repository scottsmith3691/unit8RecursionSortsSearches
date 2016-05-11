//////INCOMPLETE BETTER ALGORITHM FOR LATER VERSION
public class Keywords
{
    private String[][] statments;
    private String[] questions;
    private String code;
    private String in;
    /**
     * Constructor for objects of class Keywords
     */
    public Keywords(String input)
    {
        in = input;
        statments = new String[][]{{"hi", "hello", "hey", "sup", "suh", "howdie"},
        {"i", "my", "it", "he", "she", "you"},
        {"we","they","them","their", "us", "our"},
        {"people", "dogs", "plants", "aliens", "cats", "food"}};
        questions = new String[]{"who", "what", "where", "when", "why", "how", "do", "?"};
    }
    
    public String getKeywords()
    {
        code = "";
        for(int i = 0; i < statments.length; i++)
        {
            for(int y = 0; y < statments[0].length; y++)
            {
            if(in.toLowerCase().indexOf(statments[i][y])!=0)
            {
                code += "1";
                code += i;
                code += " ";
            }
        }
        }
        for(int x=0; x < questions.length; x++)
        {
            if(in.toLowerCase().indexOf(questions[x])!=0)
            {
                code += "2";
                code += x;
                
                code += " ";
            }
        }
        return code;
    }
}
