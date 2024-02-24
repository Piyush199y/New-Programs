package src.Basics_08;

public class StaticDemo {

    //Static variable
    public static String collegename = "Raisoni";

    //Non static variable
    public int version = 21;

    // Static method
    public static void print(){
        System.out.println("College name is " + collegename);
        //you cant have a non static variable in the Static method
        //System.out.println("Version is " + version);  // Not possible
    }

    //Non-static method
    public void print2(){
        System.out.println("Version is " + version);
        System.out.println("College name is " + collegename);
    }



}
