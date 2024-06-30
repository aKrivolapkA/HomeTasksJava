package src.main.java.lesson6.part2;

import java.util.Arrays;

import static src.main.java.lesson6.part2.FigureType.CIRCLE;

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
    //      GeometricalFigure[] figures = new GeometricalFigure[]{
    //              new Circle(point, 2),
    //              new Rectangle(point, 3, 1),
    //              new Square(point, 3, 1)
    //      };
    //      boolean result = containsCircle(figures);
    //      System.out.println("содержит ли круг: " + result);
    //  }


    public static boolean containsCircle(GeometricalFigure... figures) {
        for (GeometricalFigure figure : figures) {
            if (figure instanceof Circle) {
                return true;
            }
        }
        return false;

    }

    public static void getNotRoundFigureTypes() {
        for (FigureType figureType : FigureType.values()) {
            if (figureType.isRound()) {
                System.out.println(figureType + "tut");
            } else {
                System.out.println(figureType + "niea tut");
            }
        }

    }
}