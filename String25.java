package Git_string;
//8. Convert the string "world" to uppercase
public class String25 {
    public static void main(String[] args) {
        String str = "world";
        String str1 = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                char upperch = (char)(ch-32);
                str1 += upperch;
            }
        }
        System.out.println("Original String: " + str);
        System.out.println("Uppercase string: " + str1);
    }
    
}
