package src.NestedClass;

/**
 * Author - Piyush
 * Upcasting and Downcasting in class
 */
public class Lab037 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p = c ;
        //c = p ;  // Not possible

    }
}

class Parent{}

class Child extends Parent{}
