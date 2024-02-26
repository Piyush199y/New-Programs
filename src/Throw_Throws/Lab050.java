package src.Throw_Throws;

public class Lab050 {
    public static void main(String[] args) throws Exception {   // method level exception -> throws
        //extracted(10);
        extracted(20);
        throw new Exception("Line level exception");   //

    }

    private static void extracted(int b) {
        int a;
        if(b == 0){
            throw new ArithmeticException("b cant be zero");
        }else{
            a = 1000/b;}
        System.out.println(a);
    }
}
