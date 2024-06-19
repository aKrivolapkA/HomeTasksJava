package src.main.java.lesson8.hands;

import java.util.Random;

public class SamsungHand implements IHand{

    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }
    public SamsungHand(){}

    @Override
    public void upHand() {
        System.out.println("Робот Samsung поднял руки");

    }

    @Override
    public int getPrice() {
        Random random= new Random();
        return random.nextInt(30);
    }
}
