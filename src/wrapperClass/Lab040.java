package src.wrapperClass;

public class Lab040 {
    public static void main(String[] args) {
        int x = 123;
        // String s1 = x;  // Not possible

        String s1 = x + "";
        String s2 = String.valueOf(x);
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);

    }
}
