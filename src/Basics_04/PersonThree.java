package src.Basics_04;

public class PersonThree {
    String name;
    int age;


    PersonThree() {
        System.out.println("I am default");
    }

    PersonThree(String ref_name, int ref_age) {
        this.name = ref_name;
        this.age = ref_age;

    }

    void printDetails() {
        System.out.println("Your ref name is -> " + this.name);
        System.out.println("Your ref age is -> " + this.age);
    }

}
