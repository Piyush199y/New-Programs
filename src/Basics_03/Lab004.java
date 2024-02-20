package src.Basics_03;
/**
 * Author - Piyush
 * String builder & String buffer
 */
public class Lab004 {
    public static void main (String[] args){
        String s = "New";  // String constant pool
        String s1 = new String("String");
        StringBuilder s3 = new StringBuilder("Builder");  // Who build the String
        s3.append(" Bob");
        System.out.println(s3);

        StringBuffer s4 = new StringBuffer("Buffer");     // Who will keep the String
        s4.append(" Bobby");
        System.out.println(s4);

    }
}
