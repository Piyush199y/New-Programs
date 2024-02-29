package src.Collections03;

import java.util.HashSet;
import java.util.Set;

public class Lab064 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        // fruits.add(12456);  // Not allowed
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Water Melon");  // The order will not be fixed it will be random as this is a HashSet

        System.out.println(fruits);  // It does not maintain any order
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());  // It will not count the repeated value
        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.contains("mango")); // It is case-sensitive

    }





}
