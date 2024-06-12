package src.main.java.lesson4;
/*
Проверить произведение элементов какой диагонали больше.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
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

        int firsDiagonal = 1;
        for (int i = 0; i < size; i++) {
            firsDiagonal *= array[i][i];
        }

        int secondDiagonal = 1;
        for (int i = 0; i < size; i++) {
            secondDiagonal *= array[i][size - 1 - i];
        }

        if (firsDiagonal > secondDiagonal) {
            System.out.println("Произведение элементов главной диагонали больше.");
        } else if (firsDiagonal < secondDiagonal) {
            System.out.println("Произведение элементов побочной диагонали больше.");
        } else {
            System.out.println("Произведения элементов диагоналей равны.");
        }

        System.out.println("Произведение главной диагонали: " + firsDiagonal);
        System.out.println("Произведение побочной диагонали: " + secondDiagonal);
    }
}

