package src.main.java.lesson6.part2;

public class Square extends GeometricalFigure {
    private double width;

    public Square(Point center, double width) {
        super(center);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.SQUARE;
    }

    @Override
    public double getArea() {
        if (width != width) {
            System.out.println("вы ввели значения прямоугольника, а не квадрата");
        }
        return width * width;
    }

    @Override
    public double getPerimeter() {
        if (width != width) {
            System.out.println("вы ввели значения прямоугольника, а не квадрата");
        }
        return (width + width) * 2;

    }


    @Override
    public boolean containsPoint(Point point) {
        if ((point.getX()<=getCenter().getX()*2)&&((point.getY()<=getCenter().getY()*2))) {
            System.out.println("содержит точку");
            return true;
        } else {
            System.out.println("не содержит точку");
            return false;
        }

    }


    public void printInformation() {
        System.out.println("КВАДРАТ \n" + "Фигура в общем: " + " Ширина: " + getWidth() + " Высота: " + getWidth());
        System.out.println("периметр " + getPerimeter());
        System.out.println("площадь: " + getArea());
    }
}