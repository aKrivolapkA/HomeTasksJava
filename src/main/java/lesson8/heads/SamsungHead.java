package src.main.java.lesson8.heads;

import java.util.Random;

public class SamsungHead implements IHead {
    private int price;
    public SamsungHead(int price) {
        this.price = price;
    }
    public SamsungHead(){
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        Random random= new Random();
        return random.nextInt(30);
    }
}
