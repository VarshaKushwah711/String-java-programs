package Git_string;
import java.util.Scanner;

//Find the index of the last occurrence of "n" in "Intelligent".

public class String30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        
        System.out.println("Enter a character to search for: ");
        char target = sc.nextLine().charAt(0);

        int index = -1;
        for(int i=str.length()-1; i>=0; i--){

            if(str.charAt(i)==target)
            {
                index = i;
                break;
            }
        }

        if(index != -1)
        {
            System.out.println("The last occurrance of '" + target + "' is at index: " + index + ".");
        }
        else{
            System.out.println("The character '" + target + "' is not found in the " + str + ".");
        }
        
        sc.close();
    }
    
}
