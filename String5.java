package String_ass;
/*5.	Write a Java program to compare a given string to the specified character sequence.
Sample Output:
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false
 */
public class String5 
{
    public static void main(String[] args) 
    {      
        String str1 = "example.com";
        String str2 = "example.com";
        String str3 = "Example.com";

        System.out.println("Comparing "+ str1 + " and " + str2 + ": " + str1.equals(str2));
        System.out.println("Comparing "+ str1 + " and " + str3 + ": " + str1.equals(str3));
    }  
}
