package src.main.java.lesson6.part2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 6);
        point.printInformation();
        Circle circle1 = new Circle(point, 1);
        circle1.printInformation();
        circle1.containsPoint(point);
        System.out.println("---------------");
        Rectangle rectangle = new Rectangle(point, 3, 2);
        rectangle.printInformation();
        rectangle.containsPoint(point);
        System.out.println("---------------");
        Square square = new Square(point, 5, 5);
        square.printInformation();
        square.containsPoint(point);
    }
}