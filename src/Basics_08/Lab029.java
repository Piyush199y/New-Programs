package src.Basics_08;

public class Lab029 {
    public static void main(String[] args) {
        System.out.println(H1.a);
        System.out.println(H1.b);

        C1 c = new C1();
        c.m1();

    }
}

interface H1{
    public static final int a = 10;
    int b = 20; // public static final are not written but in interface the variables are public static final
    int c = 30;

    void m1();   // Non-static method
}

class C1 implements H1{

    @Override
    public void m1() {
        System.out.println("Hi this is interface method called by another class");
    }
}
