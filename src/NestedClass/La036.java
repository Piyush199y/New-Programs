package src.NestedClass;

public class La036 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am a thread..!!!!");
            }
        };
        runnable.run();
    }
}
