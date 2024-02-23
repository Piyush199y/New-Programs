package src.AccessModifiers.Police;

public class Cop {
    public int gun;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot() {
        System.out.println("Yes you can, as you are police");

    }
}
