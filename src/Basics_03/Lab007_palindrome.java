package src.Basics_03;
import java.util.Scanner;
/**
 * Author - Piyush
 * Program of Palindrome
 */
public class Lab007_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value, I will tell you if its a palindrome");
        String input = sc.next();

        boolean result = isPalindrome(input);
        if(result){
            System.out.println("This is Palindrome");
        }else {
            System.out.println("This is NOT a Palindrome");
        }

    }

    private static boolean isPalindrome(String input) {
        String original = input;
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return original.equalsIgnoreCase(sb.toString());
    }
}
