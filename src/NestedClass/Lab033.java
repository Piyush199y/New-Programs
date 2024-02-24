package src.NestedClass;

public class Lab033 {
    public static void main(String[] args) {
        piyush e = new piyush();
        piyush.ipad ip = e.new ipad();
        ip.eating();


    }

}

class piyush{
    int age = 30;

    void eat(){
        System.out.println("I will eat");
    }

class ipad {
    void eating() {
        System.out.println("I am ipad");
        System.out.println(age);
    }
}
}