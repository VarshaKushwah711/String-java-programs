package Git_string;

public class String13 {
    public static void main(String[] args) 
    {
        
        String str = "The Quick BroWn FoX";
        String str2 = "";
        for(int i=0; i<str.length(); i++)
        {
            char c = ' ';
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                c = (char)(str.charAt(i)+('A'-'a'));            
                str2 += c;
            }
            else
            {
                str2 += str.charAt(i);
            }
        }   
        System.out.println("Original string: " + str);
        System.out.println("New Sring: " + str2); 
    }
}

