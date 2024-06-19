package src.main.java.lesson8.legs;

import java.util.Random;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg(){}
    @Override
    public void step() {
        System.out.println("Робот Toshiba делает шаг");

    }

    @Override
    public int getPrice() {
        Random random= new Random();
        price=random.nextInt(30);
        return price;
    }
}
