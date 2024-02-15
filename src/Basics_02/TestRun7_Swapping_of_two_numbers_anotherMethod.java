package src.Basics_02;
import java.util.Scanner;
/**
 * Author - Piyush
 * Swapping of two numbers
 *
 * Known issues = This will not work if either values is 0.
 */
public class TestRun7_Swapping_of_two_numbers_anotherMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        a = a * b;
        b = a/b;
        a = a/b;

        System.out.println("The value of a is = " + a);
        System.out.println("The value of b is = " + b);

        sc.close();



    }
}