package src.Basics_04;

public class ABCperson {
    String name;  // Instance variable  - This values will be default
    long phone;
    String email;
    boolean isMarried;
    int age;

    ABCperson (){
        name = "Actual use of default constructor"; //  practical use of default constructor
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
        System.out.println(age);

    }

}
