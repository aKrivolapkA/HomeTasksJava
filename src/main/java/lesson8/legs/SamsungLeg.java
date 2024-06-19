package src.main.java.lesson8.legs;

import java.util.Random;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg(){}
    @Override
    public void step() {
        System.out.println("Робот Samsung делает шаг");

    }

    @Override
    public int getPrice() {
        Random random= new Random();
        return random.nextInt(30);
    }
}
