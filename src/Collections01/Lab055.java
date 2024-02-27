package src.Collections01;
import java.util.ArrayList;
import java.util.List;

public class Lab055 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Testing");
        myList.add("ArrayList");
        myList.add(1000);
        myList.add(true);


        System.out.println(myList);
        myList.set(1, "testing add method");
        System.out.println(myList);
        myList.remove("testing add method");
        System.out.println(myList);
        myList.set(0 , "I am the first element now");


        System.out.println(myList.get(0));  // To get the element on that particular index

        for(int i = 0 ; i< myList.size(); i++){
            System.out.println(myList.get(i));
        }

        System.out.println("SPACE : Another output ");

        for (Object o: myList){
            System.out.println(o);  // Another way to iterate the ArrayList
        }


    }
}
