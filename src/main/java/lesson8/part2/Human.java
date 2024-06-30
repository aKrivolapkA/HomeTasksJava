package src.main.java.lesson8.part2;

public class Human implements Jacket, Trousers, Shoes {

    private String name;
    private Jacket jacket;
    private Trousers trousers;
    private Shoes shoes;

    public String getName() {
        return name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public Shoes getShoes() {
        return shoes;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        trousers.takeOff();
        shoes.takeOff();
    }

    public Human(String name, Jacket jacket, Trousers trousers, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }
}
