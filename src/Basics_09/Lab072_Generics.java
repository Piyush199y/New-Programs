package src.Basics_09;

public class Lab072_Generics {
    public static void main(String[] args) {
        temp(123);
        temp(1.24);
        temp("I can take input as any Data type");
        temp("and give output");
        temp(true);
        temp('P');

    }

    public static <Anything> void temp(Anything x ){  // Generic means a universal datatype which will accept
        System.out.println(x);                       // all the given values
    }
}
