package Git_string;

import java.util.Scanner;

public class String19 {

        public static void main(String[] args) {
            //String str = "This is a String";
            Scanner sc = new Scanner((System.in));
            System.out.print("Enter a sentance: ");
            String str = sc.nextLine();

            String strArray[] = str.split(" ");

            System.out.print("String without space: ");

            for(int i=0; i<strArray.length; i++)
            {
                System.out.print(strArray[i]);
            }
        }
    
    
}
