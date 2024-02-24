package src.Interface;

interface FatherI {
    void loan1l();

    default void print(){
        System.out.println("I am default");
    }

    static void print2(){
        System.out.println("I am static");
    }


}
