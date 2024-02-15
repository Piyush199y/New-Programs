package src.Basics_02;
import java.util.Scanner;

/**
 * Author - Piyush
 * How to get input and print array
 */

public class TestRun8_How_to_get_input_and_print_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println(" Please enter the element ");
        for(int i = 0 ; i < n ; i ++){
         arr[i] = sc.nextInt();}

        System.out.println(" --- Output -- ");

        for(int i =0 ; i < n ; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
