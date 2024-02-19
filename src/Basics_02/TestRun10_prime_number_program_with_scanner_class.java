package src.Basics_02;
import java.util.Scanner;
/**
 * Author - Piyush
 *Prime number program
 */
public class TestRun10_prime_number_program_with_scanner_class {
    public static void main(String[] args) {
        // Prime number condition - a natural number greater than 1 and is divisible by only 1 and itself

        int flag = 0;
        int m= 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int n = sc.nextInt();

        //  m/2 -> num%i == 0 -> Not a prime

        m = n/2;
        if(n == 0 || n==1){
            System.out.println( n + " Is Not a prime number");
        }else {
            for(int i = 2 ; i <= m ; i++ ){
                if(n%2 ==0) {
                    System.out.println(n + " Is Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0){
            System.out.println(n + "  Is a prime number");
        }



    }
}
