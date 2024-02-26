package src.Throw_Throws;

public class Lab049 {
    public static void main(String[] args) {
        //extracted(10);
        extracted(0);

    }

    private static void extracted(int b) {
        int a = 0;
        if(b == 0){
            throw new ArithmeticException("Hello, b is zero, Cant process");
        }else{
            a = 10/b;}
        System.out.println(a);
    }
}
