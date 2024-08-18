package Git_string;
/*Write a Java program to convert all characters in a string to uppercase.
Sample Output:
Original String: The Quick BroWn FoX!                                                                         
String in uppercase: THE QUICK BROWN FOX!
 */
public class String12
{
    public static void main(String[] args) 
    {
        String str = "The Quick BroWn FoX!";
        String newstr = str.toUpperCase();
        System.out.println("Original string: " + str);
        System.out.println("New string: " + newstr);  
    } 
}

