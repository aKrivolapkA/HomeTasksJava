package src.main.java.lesson8.part2;

public class AdidasShoes  implements Shoes {

    @Override
    public void putOn() {
        System.out.println("Кроссовки адидас надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Кроссовки адидас сняты");

    }
}
