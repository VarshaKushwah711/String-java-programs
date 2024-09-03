package Git_string;

//Concatenate two strings "Hello" and "World".
public class String20 {
    public static void main(String[] args) {
        
        String str = "hello";
        String str1 = "world";
        //1. Using the + Operator
        String Result1 = str +" " +str1;
        System.out.println("Using the + Operator: " +Result1);
        //2. Using String.concat()
        String Result2 = str.concat(" "+str1);
        System.out.println("Using String.concat(): "+Result2);
        //3. Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str1);
        String Result3 = sb.toString();
        System.out.println("Using StringBuilder: " + Result3);
        //4. Using StringBuffer
        StringBuffer sbf = new StringBuffer();
        sbf.append(str);
        sbf.append(" ");
        sbf.append(str1);
        String Result4 = sb.toString();
        System.out.println("Using StringBuffer: " + Result4);
        //5. Using String.join()
        String Result5 = String.join(" ",str,str1);
        System.out.println("Using String.join(): " + Result5);
    }   
}
