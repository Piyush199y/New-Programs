package src.Interface.Real_time;

public class car implements Engine , Break{

    void start(){
        System.out.println("Start car");
        startEngine();
        breaks();
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void breaks() {
        System.out.println("Apply break");
    }
}
