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
    public boolean containsPoint( Point point) {
        double x = Math.pow((point.getX()-getCenter().getX()),2);
        double y = Math.pow((point.getY()-getCenter().getY()),2);
        double r =Math.pow(getRadius(),2);
        if(x+y<=r){
            System.out.println("содержит точку");
            return true;
        }else {
            System.out.println("не содержит точку");
            return false;
        }
    }

    @Override
    public void printInformation(){
        System.out.println("КРУГ: \n"+"координаты центра: "+  super.getCenter().getX() + "  "  + getCenter().getY() + " радиус круга " + radius   );
        System.out.println("периметр: "  +getPerimeter());
        System.out.println("площадь: "  +getArea());
    }

}