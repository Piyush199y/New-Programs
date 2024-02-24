package src.Method_Overriding;

public class RC1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Hound h = new Hound();
        h.bark();

        Dog f = new Hound();  // Dynamic dispatch or Runtime Polymorphism
        f.bark();
    }
}
