package src.Basics_05;

public class Lab018 {
    public static void main(String[] args) {
        Grandfather g = new Grandfather();
        g.home(); // This is the disadvantage of this ref

        Father f = new Father();
        f.home();
        f.home2();

        Son s = new Son();
        s.home();
        s.home2();
        s.home3();  // Multiple inheritance

    }
}
