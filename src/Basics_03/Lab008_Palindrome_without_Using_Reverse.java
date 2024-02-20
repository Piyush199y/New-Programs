package src.Basics_03;
import java.util.Scanner;
/**
 * Author - Piyush
 * Palindrome without using  reverse
 */
public class Lab008_Palindrome_without_Using_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        String s = sc.next();
        //String s = "Piyush";
        String s1 = "";

        for(int i = s.length()-1; i >= 0 ; i--){
            s1 = s1 + s.charAt(i);
        }
        if(s1.equalsIgnoreCase(s)){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Its NOT a palindrome");
        }
        sc.close();

    }
}
