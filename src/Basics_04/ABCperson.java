package src.Basics_04;

public class ABCperson {
    String name;  // Instance variable  - This values will be default
    long phone;
    String email;
    boolean isMarried;

    ABCperson (){
        System.out.println("I am default.!");   // This is a default constructor
    }
    void talk(){
        System.out.println("Talk.!");
    }

    void printdetails(){
        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(isMarried);

    }

}
