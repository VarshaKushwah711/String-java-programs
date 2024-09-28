package Git_string;
import java.util.Scanner;
//17. Count the number of vowels in the string "Education".
public class String35 {
    public static void main(String[] args) {
        char arr[] = {'a', 'i', 'e', 'o', 'u'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            for(int j=0; j<arr.length; j++)
            {                                                                                       
                if(str.toLowerCase().charAt(i) == arr[j])
                {
                    count++;
                }
            }
        }
        System.out.println("Number of vowel: " + count);
        sc.close();
    }
    
    
}


