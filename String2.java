package String_ass;
//2.	Write a Java program to compare two strings lexicographically. 

public class String2 {
    public static void main(String[] args) 
    {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        int result = str1.compareTo(str2);

        System.out.println(result);

        if(result < 0) 
        {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str2 + "\".");        }
        else if(result > 0)
        {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\".");
        }
        else
        {
            System.out.println("\"" + str1 + "\" is lexicographically equal to \"" + str2 + "\".");        }
    }
}
