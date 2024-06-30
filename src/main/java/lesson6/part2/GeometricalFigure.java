package src.main.java.lesson6.part2;

public abstract class GeometricalFigure implements Printable {
    private Point center;

    public void setCenter(Point center) {
        this.center = center;
    }

    public GeometricalFigure(Point center) {
        this.center = center;
    }

    public final Point getCenter() {
        return center;
    }

    public abstract FigureType getFigureType();

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract boolean containsPoint(Point p);


    public void printInformation() {
        System.out.println("информацию о фигуре в общем " + getCenter().getX() + "  " + getCenter().getY());
    }




}