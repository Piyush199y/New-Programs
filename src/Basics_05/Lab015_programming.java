package src.Basics_05;

public class Lab015_programming {
    public static void main(String[] args) {
        Programming p = new Programming();  // Super/Parent/Base Class
        //How JVM understand above lines/program
        // Programming - Class
        // p - ref to an object
        // new Programming() - Object

        Programming p1 = new Programming("Python", 12);
        p.printInfo();
    }
}
