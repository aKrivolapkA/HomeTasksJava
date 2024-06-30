package src.main.java.lesson8.part3;

public class Main {
    public static void main(String[] args) {

        Cosmodrom cosmodrom = new Cosmodrom();

        Shuttle shuttle = new Shuttle();
        cosmodrom.start(shuttle);

        SpaceX spaceX = new SpaceX();
        cosmodrom.start(spaceX);
    }
}