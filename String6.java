package String_ass;
/*6.	 
Write a Java program to compare a given string to a specified string buffer.
Sample Output:
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false 
 */
public class String6 
{
    public static void main(String[] args) {

        String str1 = "example.com";
        StringBuffer strBuffer1 = new StringBuffer("example.com");
        String str2 = "Example.com";
        StringBuffer strBuffer2 = new StringBuffer("example.com");

        // Compare the strings and string buffers and print the results
        System.out.println("Comparing " + str1 + " and " + strBuffer1 + ": " + str1.equals(strBuffer1.toString())); // true
        System.out.println("Comparing " + str2 + " and " + strBuffer2 + ": " + str2.equals(strBuffer2.toString())); // false

        System.out.println("Comparing " + str1 + " and " + strBuffer1 + ": " + str1.contentEquals(strBuffer2)); // true
        System.out.println("Comparing " + str2 + " and " + strBuffer2 + ": " + str2.contentEquals(strBuffer2)); // false       
    }
}

