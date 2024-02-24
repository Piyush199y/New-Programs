package src.Abstraction;

public abstract class Animal {

    Animal(){}

    void m1(){
        System.out.println("I am m1 function");  // Complete or concrete method
    }

    abstract void m2();  // Incomplete - Some one will inherit and do
}
