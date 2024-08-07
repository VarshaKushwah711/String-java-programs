package String_ass;
//1. Write a Java program to get the character at the given index within the string.

import java.util.Scanner;

public class String1 
{
    public static void main(String[] args) 
    {      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Enter an index(0 to " + (str.length()-1) + "): ");
        int index = sc.nextInt();

        if(index>=0 || index<str.length())
        {
            System.out.println("The character at index " + index + " is: " + str.charAt(index));
        }
        else
        {
            System.out.println("Index " + index + " is out of bounds for the string.");
        }

        sc.close();
    }
    
}
