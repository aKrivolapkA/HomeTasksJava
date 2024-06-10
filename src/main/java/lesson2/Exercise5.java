package src.main.java.lesson2;

import java.util.Scanner;

/*
(Дополнительно) В переменную записываете количество программистов. В зависимости от количества программистов необходимо вывести правильно окончание.
Например:
• 2 программиста
• 1 программист
• 10 программистов
• и т.д.

 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  число програмистов: ");
        int number = scanner.nextInt();

        if (number % 100 >= 11 && number % 100 <= 19) {
            System.out.println(number + " программистов");
        } else if (number % 10 == 1) {
            System.out.println(number + " программист");
        } else if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4) {
            System.out.println(number + " программиста");
        } else if (number <= 0) {
            System.out.print("Неверное значение, количество программистов должно быть больше нуля");
        } else {
            System.out.println(number + " программистов");
        }
    }
}