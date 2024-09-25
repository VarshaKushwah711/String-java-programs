package Git_string;
import java.util.Scanner;
//15. Split the string "Hello World" into two parts.
public class String33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter how many parts to split: ");
        int parts = sc.nextInt();

        if(parts>0)
        {
            String[] arr = str.split(" ", parts);
        
            for(int i=0; i<arr.length; i++)
            {
                System.out.println("part " + (i+1) + ": " + arr[i]);
            }
        }
        else
        {
            System.out.println("Number of parts must be greater than 0.");
        }
        sc.close();

    }
    
}

