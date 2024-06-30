package src.main.java.lesson6.part2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 6);
        point.printInformation();
        Circle circle1 = new Circle(point, 5);
        circle1.printInformation();

        Rectangle rectangle = new Rectangle(point, 3, 3);
        rectangle.printInformation();

        Square square = new Square(point, 3, 3);
        square.printInformation();
        System.out.println("------------");
        square.containsPoint(point);



    }
}