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
        return width* height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) *2;
    }

    @Override
    public boolean containsPoint( Point p) {
        return false;
    }

    public void printInformation(){
        System.out.println("ПРЯМОУГОЛЬНИК \n" + "Фигура в общем: " + " Ширина: " + getHeight() + " Высота: " + getWidth());
        System.out.println("периметр " + getPerimeter());
        System.out.println("площадь: "  +getArea());
    }
}