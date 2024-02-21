package src.Basics_04;

public class Persontwo {
    String name;  // Instance variable  - This values will be default
    long phone;
    String email;
    boolean isMarried;
    int age;

    Persontwo(){
        System.out.println("This is default constructor");
    }

    Persontwo(String Objectvalue){
        this.name = Objectvalue;
    }

    void printdetails2() {
        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(isMarried);
        System.out.println(age);
    }

}
