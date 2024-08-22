package Git_string;
/*15.	Write a Java program to find the most frequent character in a given string.
Sample Output:
 */
public class String14 {

    public void getResult(String s)
    {
        char ch = ' ';
        int max = 0;
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            count = 0;
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    ch = s.charAt(i);
                    count++;
                }
                if(count>max)
                {
                    max=count;
                    ch=s.charAt(i);
                }
            }
        }
        System.out.print("The given string is: " + s);
        System.out.println("\nmost frequent character in a given string: " + ch +" "+ count +" times" );

    }
    
    public static void main(String[] args) 
    {
        String str = "successes";
        new String14().getResult(str);      
    }
}
