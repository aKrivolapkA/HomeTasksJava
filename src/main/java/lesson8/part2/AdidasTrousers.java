package src.main.java.lesson8.part2;

public class AdidasTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Штаны адидас надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны адидас сняты");

    }
}
