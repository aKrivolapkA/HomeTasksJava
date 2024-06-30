package src.main.java.lesson8.part2;

public class AdidasJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Куртка адидас надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка адидас снята");

    }
}
