package Git_string;

import java.util.Scanner;

//Find the index of the first occurrence of "e" in "Java Programimg"
public class String29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter a character to search for: ");
        char target = sc.nextLine().charAt(0);
        int index = str.toLowerCase().indexOf(Character.toLowerCase(target));
        if(index != -1)
        {
            System.out.println("The first occurrence of '" + target + "' is at index: " + index);
        }
        else{
            System.out.println("The character '" + target + "' is not found in the string.");
        }
        sc.close();
    }
    
}
