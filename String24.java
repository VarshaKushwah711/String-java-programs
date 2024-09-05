package Git_string;
//7. Convert the string "HELLO" to lowercase
public class String24 {
    public static void main(String[] args) {
        String str = "HELLO";
        String str2 = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' || ch<='Z')
            {
                char lowerch = (char)(ch+32);  
                str2 += lowerch;
            
            }
        }
        System.out.println("Original String: " + str);
        System.out.println("lowercase: "+str2);
    }
    
}
