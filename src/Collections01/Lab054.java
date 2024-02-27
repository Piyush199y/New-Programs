package src.Collections01;
import java.util.List;

/**
 * Author- Piyush
 * Collections framework
 */
public class Lab054 {
    public static void main(String[] args) {
        List fruits = List.of("orange", "apple", "Banana", "apple", "watermelon");  // null is not allowed in List
        List shoppingList = List.of("Milk", "eggs", "bread");
        List myMarks = List.of(80, 90, 76, 61, 62);
        List different_Data_types = List.of("Testing", "Version", 21 , true);

        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        System.out.println(fruits.indexOf("Banana"));
        System.out.println(fruits.isEmpty());

        // fruits.add("Mango");   // Not allowed // List.of() will not allow this



    }
}
