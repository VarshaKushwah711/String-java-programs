package String_ass;
/*4.	 Write a Java program to concatenate a given string to the end of another string.
String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises
 */
public class String4 
{
    public static void main(String[] args) 
    {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Excerises";

        //concatenate two strings using the + operator:
        System.out.println("The concatenated string: " + str1+str2);

        //concatenate two strings using concat()
        String str3 = str1.concat(str2);
        System.out.println("The concatenated string using concat(): " + str3);

        //concatenate two strings using String.join()
        String str4 = String.join(" ",str1,str2);
        System.out.println("Concatenated String Using String.join(): " + str4);
    }  
}
