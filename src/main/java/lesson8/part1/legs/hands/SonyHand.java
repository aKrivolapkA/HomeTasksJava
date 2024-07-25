package src.main.java.lesson8.part1.legs.hands;

import java.util.Random;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }
    public SonyHand(){}
    @Override
    public void upHand() {
        System.out.println("Робот Sony поднял руки");

    }

    @Override
    public int getPrice() {
        Random random= new Random();
        return random.nextInt(30);
    }
}
