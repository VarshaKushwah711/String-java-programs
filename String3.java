package String_ass;
/*
3.	Write a Java program to compare two strings lexicographically, ignoring case differences.
String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1"
 */
public class String3 {
    public static void main(String[] args) 
    {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        int result = str1.compareToIgnoreCase(str2);

        System.out.println(result);

        if(result < 0) 
        {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str2 + "\"when ignoring case.");        }
        else if(result > 0)
        {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\"when ignoring case.");
        }
        else
        {
            System.out.println("\"" + str1 + "\" is lexicographically equal to \"" + str2 + "\" when ignoring case.");        
        }
    }
}