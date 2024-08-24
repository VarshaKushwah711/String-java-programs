package Git_string;

import java.util.Scanner;

public class String18 {
    //check Palindrome String in Java 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        String rev = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            rev += str.charAt(i);
        }
        System.out.println(str + " = " + rev);
        
        if(str.equals(rev))
        {
            System.out.println("String is Palindrome");
        }
        else 
        {
            System.out.println("String is not Palindrome");
        }
        
    }

}
