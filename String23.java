package Git_string;
//Replace "a" with "o" in the string "banana".
public class String23 {
    public static void main(String[] args) {
        
        String str = "banana";
        String str2 = "";
        for(int i=0; i<str.length(); i++)
        {
            
            if(str.charAt(i) == 'a')
            {
                str2 += 'o';
            }
            else
            {
                str2 += str.charAt(i);
            }        
        }
        System.out.println(str2);
    }
    
}
