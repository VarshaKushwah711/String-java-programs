package Git_string;
//10. Remove the trailing whitespace from the string "World ".
public class String28 {

    public static void main(String[] args) {
        
        String str = "Hello ";
        System.out.println("'"+str+"'");

        //1st method
        String str2 = str.trim();
        System.err.println("'"+str2+"'");

        //2nd method Manual removal of trailing whitespace
        String str3 = "";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)!=' ')
            {
                str3 += str.charAt(i);
            }
        }
        System.out.println("'"+str3+"'");
                
    }
       
}
