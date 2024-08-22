package Git_string;
/*16.	 Write a Java program to print all permutations of a given string with repetition.
Sample Output:
The given string is: PQR
The permuted strings are:
PPP
PPQ
PPR
...
RRP
RRQ
RRR
 */
public class String15 {
    private static void permutationsWithRepeation(String str1)
    {
        System.out.println("The given String is: " + str1);
        System.out.println("The permuted strings are:");
        showPermutation(str1, "");
    }
    private static void showPermutation(String str1, String newstr)
    {
        //System.out.println(newstr.length()+ " "+ str1.length());

        if(newstr.length()==str1.length())
        {
            System.out.println(newstr);
            return;
        }
        for(int i=0; i<str1.length(); i++)
        {
            showPermutation(str1, newstr + str1.charAt(i));
        }

    }
    public static void main(String[] args) 
    {
        permutationsWithRepeation("PQR");
    }
    
}

