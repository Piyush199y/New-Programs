package src.Basics_08;

public class Lab028 {
    public static void main(String[] args) {
        P01 p = new P01();
        P01 p2 = new P01();

       p.m1();  // Non static - calling the method by object
       P01.m2(); // Static - calling the method by with class name & without object

        P01 p3 = null;

        //p3.m1();
        p3.m2();


    }

}

class P01{
    static {
        System.out.println("I am SIB");
    }
    {
        System.out.println("I am IIB");
    }
    int a = 10;
    static int b = 20;

    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }

    static void m2(){
        System.out.println(b);
    }




        }
