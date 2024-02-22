package src.Basics06_Hierarchical;

public class Vehicle {

    Vehicle(){
        System.out.println("Default vehicle");
    }

    void VehicleSpeed(){
        System.out.println("Yeah from " + getClass().getSimpleName());
    }

}
