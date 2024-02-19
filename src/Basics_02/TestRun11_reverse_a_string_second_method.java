package src.Basics_02;
/**
 * Author - Piyush
 * Reverse String without swapping
 */
public class TestRun11_reverse_a_string_second_method {
    public static void main(String[] args) {
        String name = "Testing_two";

        String y = "";

        for(int i = name.length()-1; i>= 0 ; i--){
            y = y + name.charAt(i);
        }
        System.out.println(y);
    }
}
