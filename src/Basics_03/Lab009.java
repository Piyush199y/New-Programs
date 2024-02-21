package src.Basics_03;

public class Lab009 {
    public static void main(String[] args) {

        Person p = new Person();  // Object
        p.name = "Java";
        System.out.println(p.name);

        Person p2 = new Person(); // Object
        p2.name = "JavaTwo";
        System.out.println(p2.name);

        new Person();  // Object without reference
        Person p3 = null; // No object will not take any memory


        // Person - Class blueprint
        // p - ref variable
        // new Person() - Real Object

    }
}
