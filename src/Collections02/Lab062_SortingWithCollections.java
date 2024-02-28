package src.Collections02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Author - Piyush
 *  Sorting of Array with Collections
 */
public class Lab062_SortingWithCollections {
    public static void main(String[] args){
        List<Integer> marklist = new ArrayList<>();
        marklist.add(67);
        marklist.add(58);
        marklist.add(77);
        marklist.add(01);
        marklist.add(99);

        Collections.sort(marklist);
        System.out.println(marklist);

    }
}
