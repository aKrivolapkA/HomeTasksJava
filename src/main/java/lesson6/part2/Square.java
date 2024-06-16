package src.main.java.lesson6.part2;

public class Square extends GeometricalFigure  {
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
        if (width!=height){
            System.out.println("вы ввели значения прямоугольника, а не квадрата");
        }
        double area = width *height;
        return area;
    }

    @Override
    public double getPerimeter() {
        if (width!=height){
            System.out.println("вы ввели значения прямоугольника, а не квадрата");
        }
        double perimeter = (width + height) *2;
        return perimeter;

    }

    @Override
    public boolean containsPoint(boolean Point) {
        return false;
    }
    public void printInformation(){
        System.out.println("КВАДРАТ \n" + "Фигура в общем: " + " Ширина: " + getWidth() + " Высота: " + getWidth());
        System.out.println("периметр " + getPerimeter());
        System.out.println("площадь: "  +getArea());

    }
}