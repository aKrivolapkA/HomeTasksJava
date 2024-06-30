package src.main.java.lesson6.part2;

public class Square extends GeometricalFigure {
    private double width;
    private double height;

    public Square(Point center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getFigureType() {
        return null;
    }

    @Override
    public double getArea() {
        if (width != height) {
            System.out.println("вы ввели значения прямоугольника, а не квадрата");
        }
        return width * height;
    }

    @Override
    public double getPerimeter() {
        if (width != height) {
            System.out.println("вы ввели значения прямоугольника, а не квадрата");
        }
        return (width + height) * 2;

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