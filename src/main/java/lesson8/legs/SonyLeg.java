package src.main.java.lesson8.legs;

import java.util.Random;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg(){}
    @Override
    public void step() {
        System.out.println("Робот Sony делает шаг");

    }

    @Override
    public int getPrice() {
        Random random= new Random();
        return random.nextInt(30);
    }
}
