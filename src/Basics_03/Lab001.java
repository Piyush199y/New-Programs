package src.Basics_03;
/**
 * Author - Piyush
 * Example of how String is immutable in Java
 */
public class Lab001 {
    public static void main(String[] args) {
        String s = "Old string";  // Will be stored in String constant pool
        String s1 = new String(); // Will be stored in the heap memory\

        s = "New string";

        String str1 = "Hello";
        str1 = str1.concat("World");
        System.out.println(str1);
        String str2 = "Hello";


    }
}

