package src.Exceptions;

public class Lab045 {
    public static void main(String[] args) {
        String sh = args[0]; // "137" String
        int x = Integer.parseInt(sh);  // String to primitive
        int a = 10/x;

        System.out.println(x);
        System.out.println(a);

    }
}
