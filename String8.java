package String_ass;
/*8.	Write a Java program to replace a specified character with another character.
Sample Output:
Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown fox jumps over the lazy fog.
 */
public class String8 
{
    public static void main(String[] args) 
    {
        String str = "The quick brown for jumpes over the lazy dog";
        String strArr[] = str.split(" ");

        for(int i=0; i<strArr.length; i++)
        {
            if(strArr[i].equalsIgnoreCase("dog"))
            {
                strArr[i] = "fog";
            }
        }

        String newstr ="";

        for(String i : strArr)
        {
            newstr += i+" ";
        }

        System.out.println("Before replace: " + str);
        System.out.println("After replace: " + newstr);
    }
    
}
