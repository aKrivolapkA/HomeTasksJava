package src.main.java.lesson8.heads;

import java.util.Random;

public class ToshibaHead implements IHead {

    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }
    public ToshibaHead(){}
    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        Random random= new Random();
        return random.nextInt(30);
    }
}
