package src.Collections01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author - Piyush
 * MyList with custom Iterator
 */
public class Lab057 {
    public static void main(String[] args){
        List<String> mylist2 = new ArrayList<>();   // <> is called diamond operator
        mylist2.add("Testing");
        mylist2.add("ArrayList with");
        mylist2.add("custom");
        mylist2.add("Iterator");

        Iterator iterator = mylist2.iterator();  // Creating custom Iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
