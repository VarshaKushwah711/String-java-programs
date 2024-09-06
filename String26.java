package Git_string;
//9. Remove the leading whitespace from the string " Hello".
public class String26 {
    public static void main(String[] args) {
        
        // Original string with leading whitespace
        String str = "  hello ";
        System.out.println("Original String: " + str);

        // Method 1: Using trim()
        String str1 = str.trim();
        System.out.println("Trimmed using trim(): " + str1);

        //method 2:
        String str2 = "";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                str2 += str.charAt(i);
            }   
        }
        System.out.println("Removing the leading whitespace from the string \" Hello\": " + str2);

        // Method 3: Using regular expressions with replaceFirst()
        String trimmedString3 = str.replaceFirst("^\\s+", "");
        System.out.println("Trimmed using replaceFirst() with regex: " + trimmedString3);
    }
    
}
