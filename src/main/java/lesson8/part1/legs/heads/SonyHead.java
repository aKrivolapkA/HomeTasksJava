package src.main.java.lesson8.part1.legs.heads;

import java.util.Random;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        Random random= new Random();
        return random.nextInt(30);
    }
}
