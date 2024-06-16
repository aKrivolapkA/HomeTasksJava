package src.main.java.lesson6.part2;

public class Rectangle extends GeometricalFigure{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(Point center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getFigureType() {
        return null;
    }

    @Override
    public double getArea() {
        double area= width* height;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (width + height) *2;
        return perimeter;
    }

    @Override
    public boolean containsPoint(boolean Point) {
        return false;
    }

    public void printInformation(){
        System.out.println("ПРЯМОУГОЛЬНИК \n" + "Фигура в общем: " + " Ширина: " + getHeight() + " Высота: " + getWidth());
        System.out.println("периметр " + getPerimeter());
        System.out.println("площадь: "  +getArea());
    }
}