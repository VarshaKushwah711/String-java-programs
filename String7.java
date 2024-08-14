package String_ass;
/*7.	Write a Java program to check whether two String objects contain the same data.
Sample Output:
"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "Mike Royko"? false
 */
public class String7 
{
    public static void main(String[] args) 
    {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "Mike Royko";
        String str4 = "Stephen Edwin King";

        //String s = new String("Stephen Edwin King");
        //System.out.println(str1.equals(s));
        
        System.out.println(str1 + " equals " + str2 +": "+ str1.equals(str2) );
        System.out.println(str1 + " equals " + str3 +": "+ str1.equals(str3) );
        System.out.println(str1 + " equals " + str4 +": "+ str1.equals(str4) ); 
    }    
}
