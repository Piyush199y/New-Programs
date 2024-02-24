package src.NestedClass;

public class Lab031 {
    public static void main(String[] args) {
        car c = new car("Lambo08");

        car.engine e = c.new engine("400cc");  // this is how we can access nested class
        e.start();
        c.drive();

    }
}

class car {
    String make;

    public car(String make) {
        this.make = make;
    }

    void drive() {
        System.out.println("You can drive the car");
    }

    public class engine {
        String horsepower;

        public engine(String horsepower) {
            this.horsepower = horsepower;
        }

        void start() {
            System.out.println("Engine is started -> " + make);
        }
    }
}

