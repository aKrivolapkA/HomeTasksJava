package src.main.java.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Вывести нечетные элементы находящиеся под главной диагональю(включительно).

 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер матрицы: ");
        int size = scanner.nextInt();

        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        System.out.println("Матрица: ");
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }
        System.out.println("\nэлементы находящиеся под главной диагональю(включительно): ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }

        }
    }
}
