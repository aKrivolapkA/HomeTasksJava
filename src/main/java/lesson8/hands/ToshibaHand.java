package src.main.java.lesson8.hands;

import java.util.Random;

public class ToshibaHand implements IHand {

    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }
    public ToshibaHand(){}

    @Override
    public void upHand() {
        System.out.println("Робот Toshiba поднял руки");

    }

    @Override
    public int getPrice() {
        Random random= new Random();
        price=random.nextInt(30);
        return price;
    }
}
