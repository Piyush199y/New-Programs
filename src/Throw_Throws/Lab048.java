package src.Throw_Throws;

public class Lab048 {
    public static void main(String[] args) {
        //extracted(10);
        extracted(20);

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
