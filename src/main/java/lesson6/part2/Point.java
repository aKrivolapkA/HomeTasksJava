package src.main.java.lesson6.part2;

public  final class Point {
    private  final double x;
    private  final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void printInformation(){
        System.out.println("Point  в общем "+ " x= " + x  +" y = "+  y  );
    }
}