package src.main.java.lesson8.part2;

public class Human1  extends  Human{
    public Human1(String name, Jacket jacket, Trousers trousers, Shoes shoes) {
        super(name, jacket, trousers, shoes);
    }

    public static void main(String[] args) {
        Human human = new Human("Alex ", new AdidasJacket(), new AdidasTrousers(), new AdidasShoes());
        human.putOn();
        System.out.println("______________-");
        human.takeOff();
    }
}