package src.NestedClass;

public class Lab035 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                System.out.println(" I am thread");
            }
        };
        t.run();
    }
}
