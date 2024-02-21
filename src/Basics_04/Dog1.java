package src.Basics_04;

public class Dog1 {
    String name;  // Instance variable

    Dog1(){
        System.out.println("Dog name is -> " + "Default");
    }

    Dog1(String ref_name){
        this.name = ref_name;

    }

    void bark(){
        int age = 10;  // Local variable
        System.out.println("Dog name is -> " + this.name);
        System.out.println("Bark");
        System.out.println(age);

    }

}
