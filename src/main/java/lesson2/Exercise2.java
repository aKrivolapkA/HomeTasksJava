package src.main.java.lesson2;

public class Exercise2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 9;
        if ( a > b+c||  b > a+c||c> a+b) {
            System.out.println("треугольника с такими сторонами не существует");
        } else {
            System.out.println("треугольника с такими сторонами  существует");
        }
    }
}