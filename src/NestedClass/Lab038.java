package src.NestedClass;
/**
 * Author - Piyush
 * Upcasting and Downcasting in class
 */
public class Lab038 {
    public static void main(String[] args) {
        Hello hello = new Child2();
        // Child2 c = new Parent();   // This is not possible ideally
        Child2 c2 = (Child2)hello;  // This is downcasting




    }
}

class Hello{}

class Child2 extends Hello{}