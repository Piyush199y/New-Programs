package src.Basics_08;

public class Lab027 {
    public static void main(String[] args) {
//        System.out.println(StaticDemo.collegename);
//        StaticDemo.print();

        StaticDemo s1 = new StaticDemo();
        s1.version = 2011;
        s1.print2();

        StaticDemo.collegename = "Suryodaya";

        StaticDemo s2 = new StaticDemo();
        s2.version = 2018;
        s2.print2();

    }
}
