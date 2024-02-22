package src.Basics06_Hierarchical;

public class Lab019 {
    public static void main(String[] args) {

        Car c = new Car();
        Truck t = new Truck();
        Vehicle v = new Vehicle();

        Vehicle v2 = new Car();
//        Car c2 = new Vehicle();
//        Truck t2 = new Vehicle();  // Not possible

        // Car c3 = new Truck();  // Not possible - No relation




    }
}
