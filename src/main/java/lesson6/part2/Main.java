package src.main.java.lesson6.part2;

import java.util.ArrayList;
import java.util.List;


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
        System.out.println("---------------");


        System.out.println("содержит ли круг: " + containsCircle(new Square(point, 2, 3)));
        System.out.println("содержит ли круг: " + containsCircle(new Rectangle(point, 3, 4)));
        System.out.println("содержит ли круг: " + containsCircle(new Circle(point, 2)));

        System.out.println("---------------");
        Printable printable = new Circle(new Point(3, 2), 2);
        printable.printInformation();
        System.out.println("---------------");
        Square square1 = new Square(point, 5, 5);
        getNotRoundFigureTypes();

    }

    public static boolean containsCircle(GeometricalFigure... figures) {
        for (GeometricalFigure figure : figures) {
            if (figure instanceof Circle) {
                return true;
            }
        }
        return false;

    }

    public static FigureType[] getNotRoundFigureTypes() {
        List<FigureType> notRoundTypes = new ArrayList<>();
        for (FigureType type : FigureType.values()) {
            if (!type.isRound()) {
                notRoundTypes.add(type);
            }
        }
        return notRoundTypes.toArray(new FigureType[0]);
    }

}