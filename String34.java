package Git_string;
import java.util.Scanner;
import java.lang.StringBuffer;
//16. Join the strings "Hello" and "World" with a space in between.

public class String34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str = sc.nextLine().trim();

        System.out.print("Enter second string: ");
        String str1 = sc.nextLine().trim();

        //First method
        String str2 = str + " " +str1;
        System.out.println("Using + oprator: " + str2);

        //Second method
        String str3 = str.concat(" "+str1);
        System.out.println("Using concat(): "+str3);

        // Third method Using StringBuilder
        StringBuffer sb = new StringBuffer();
        sb.append(str).append(" ").append(str1);
        System.out.println("Using StringBuffer: " + sb.toString());

        //Fourth method using string.format()
        String str4 = String.format("%s %s", str, str1);
        System.out.println("Using String.format(): " + str4);

        // Fifth method Using String.join()
        String str5 = String.join(" ",str,str1);
        System.out.println("Using String.join(): " + str5);

        sc.close();
    }
    
}
