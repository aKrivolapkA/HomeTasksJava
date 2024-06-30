package src.main.java.lesson6.part2;

public class Circle extends GeometricalFigure{
    private double radius;

    public Circle( Point center,double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getFigureType() {
        return null;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius*radius;
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI *radius;
        return Math.round(perimeter * 100.0) / 100.0;
    }

    @Override
    public boolean containsPoint( Point p) {

        return false;
    }
    //containsPointбудет проверять принаддежит ли точка обьекту  подсказка координаты точки по иксу и по игрику если координа точки больше чем центр точки

    @Override
    public void printInformation(){
        System.out.println("КРУГ: \n"+"координаты центра: "+  super.getCenter().getX() + "  "  + getCenter().getY() + " радиус круга " + radius   );
        System.out.println("периметр: "  +getPerimeter());
        System.out.println("площадь: "  +getArea());
    }

}