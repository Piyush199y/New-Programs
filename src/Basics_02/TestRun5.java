package src.Basics_02;

import java.util.Scanner;

public class TestRun5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of a is = " + a + " & " + "The value of b is = " + b);

        sc.close();

    }

}
