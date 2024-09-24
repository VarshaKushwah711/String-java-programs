package Git_string;
//14. Check if the string "World" ends with "ld".
public class String32 {
    public static void main(String[] args) {
        String str = "World";
        String suffix = "ld";
        //method 1
        if(str.length()<suffix.length())
        {
            System.out.println("\"" + str + "\" does not end with \"" + suffix + "\".");
        }
        else {
            boolean endWith = true;
            for (int i = 0; i < suffix.length(); i++) {
                //System.out.println(str.charAt(i) + "*" +suffix.charAt(i));

                if (str.charAt(str.length() - suffix.length() + i) != suffix.charAt(i)) 
                {
                    System.out.println(str.charAt(str.length() - suffix.length() + i) + " " + suffix.charAt(i));
                    endWith = false;
                    break;
                }
            }
            if(endWith)
        {
            System.out.println("\"" + str + "\" ends with \"" + suffix + "\".");
        }
        else{
            System.out.println("\"" + str + "\" does not end with \"" + suffix + "\".");
        }
        
        }
        //method 2
        if(str.endsWith(suffix))
        {
            System.out.println("\"" + str + "\" ends with \"" + suffix + "\".");
        }
        else{
            System.out.println("\"" + str + "\" does not end with \"" + suffix + "\".");
        }
            
         
    }
    
}
