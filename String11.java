/*10.	Write a Java program to convert all characters in a string to lowercase.
Sample Output:
Original String: The Quick BroWn FoX!                                                                         
string in lowercase: the quick brown fox!
*/
public class String11 {
    public static void main(String[] args) {
        String str = "The Quick BroWn FoX!";
        String str2 = "";
        for(int i=0; i<str.length();i++)
        {
            char c = ' ';
            if(str.charAt(i)>='A' && str.charAt(i) <='Z')
            {
                c = (char)(str.charAt(i)+('a'-'A'));
                str2 += c;
            }   
            else    
            {
                str2 += str.charAt(i);
            }
        }
        System.out.println("Original string: " + str);
        System.out.println("New string: " + str2);
    }
    
}
