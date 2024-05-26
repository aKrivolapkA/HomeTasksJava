package src.main.java.lesson2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  число програмистов: ");
        int number = scanner.nextInt();
        if (number == 1)
            System.out.print("1 программист");
        else if (number == 2 || number == 3 || number == 4) {
            System.out.print(number + " программиста");
        } else if (number >= 5) {
            System.out.print(number + " программистов");
        } else if (number <= 0) {
            System.out.print("Неверное значение, количество программистов должно быть больше нуля");
        }
    }
}