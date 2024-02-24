package src.Exceptions;

public class Lab046 {
    public static void main(String[] args) {

       try{
        String sh = args[0]; // "137" String
        int x = Integer.parseInt(sh);  // String to primitive
        int a = 10/x;

        System.out.println(x);
        System.out.println(a);

    } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e)
       {
           // e.printStackTrace();
           System.out.println(e.getMessage());
       }

       finally {
           System.out.println("I will be executed anyhow");
       }
    }
}
