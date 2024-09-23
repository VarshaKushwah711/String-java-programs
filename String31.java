package Git_string;
//13. Check if the string "Hello" starts with "He".
public class String31 {
    public static void main(String[] args) {

        String str = "hello";
        String prefix = "lo";

        //method 1
        if(prefix.length()>str.length())
        {
            System.out.println("\"" + str + "\" does not start with \"" + prefix + "\".");
        }
        else
        {
            boolean startsWith = true;
            for(int i=0; i<prefix.length(); i++)
            {
                if(str.charAt(i) != prefix.charAt(i))
                {
                    startsWith = false;
                    break;
                }
            }
            if(startsWith)
            {
                System.out.println("\"" + str + "\" starts with \"" + prefix + "\".");
            } 
            else {
                System.out.println("\"" + str + "\" does not start with \"" + prefix + "\".");
            }
        }



        //method 2
        String regex = "^" + prefix;
        if(str.matches(regex)){

            System.out.println("\""+str+"\" start with \""+prefix+"\".");
        }
        else{
            System.out.println("\"" + str + "\" does not start with \"" + prefix + "\".");
        }

      
        //method 3
        if(str.indexOf(prefix)==0)
        {
            System.out.println("\"" + str + "\" starts with \"" + prefix + "\".");
        } 
        else {
            System.out.println("\"" + str + "\" does not start with \"" + prefix + "\".");
        }



        //method 4
        if(str.startsWith(prefix))
        {
            System.out.println("string \""+str+"\" starts with \""+prefix+"\".");
        }
        else{
            System.out.println("\"" + str + "\" does not start with \"" + prefix + "\".");
        }

    }
    
}