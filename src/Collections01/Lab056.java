package src.Collections01;
import java.util.ArrayList;
import java.util.List;

/**
 * Author - Piyush
 * List with only one datatype
 */
public class Lab056 {
    public static void main(String[] args) {
        List <String> mylist2 = new ArrayList<>();   // <> is called diamond operator
        mylist2.add("Testing");
        mylist2.add("ArrayList with");
        mylist2.add("single");
        mylist2.add("datatype");
//        mylist2.add(123);
//        mylist2.add(true);  // This 2 will give error as different data type

        for(String o : mylist2){
            System.out.println(o);
        }






    }
}
