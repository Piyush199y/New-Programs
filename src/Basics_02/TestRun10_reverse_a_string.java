package src.Basics_02;
/**
 * Author - Piyush
 * Reverse a string
 */
public class TestRun10_reverse_a_string {
    public static void main (String[] args){
        String s = "Testing_one";
        char [] charAray = s.toCharArray();

        int left = 0;
        int right = charAray.length-1;

        while(left<right){
            char temp = charAray[left];
            charAray[left] = charAray[right];
            charAray[right]= temp;

            left ++;
            right --;
        }

        String rev = new String (charAray);
        System.out.println(rev);




    }
}
