package src.main.java.lesson3;

import java.util.Scanner;

public class ExerciseConditionals {
    public static void main(String[] args) {
/*
Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("введите три числа ");
        int[] numbers1 = new int[3];
        int countPositiveNumbers1 = 0;

        for (int i = 0; i < 3; i++) {
            numbers1[i] = scanner1.nextInt();
            if (numbers1[i] > 0) {
                countPositiveNumbers1++;
            }
        }
        System.out.println("Количество положительных чисел: " + countPositiveNumbers1);

        System.out.println("-----------------------------------");

/*
Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("введите три числа ");
        int[] numbers = new int[3];
        int countPositiveNumbers2 = 0;
        int countNegativeNumbers2 = 0;

        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner2.nextInt();
            if (numbers[i] > 0) {
                countPositiveNumbers2++;
            } else if (numbers[i] == 0) {
                System.out.println("0 не является ни положительным, ни отрицательным числом.Не берем его во внимание :D");
            } else {
                countNegativeNumbers2++;
            }
        }
        System.out.println("Количество положительных чисел: " + countPositiveNumbers2 + " Количество отрицательных чисел: " + countNegativeNumbers2);

    }
}