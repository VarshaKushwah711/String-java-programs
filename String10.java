package String_ass;
/*10.	Write a Java program to convert all characters in a string to lowercase.
Sample Output:
Original String: The Quick BroWn FoX!                                                                         
string in lowercase: the quick brown fox!
*/
public class String10 {
    public static void main(String[] args) 
    {
        String str = "The Quick BroWn FoX!";
        String newstr = str.toLowerCase();
        System.out.println("Original string: " + str);
        System.out.println("New string: " + newstr);
    }
}
