package src.main.java.lesson4;
/*
Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
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

        int suma = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[i][j] % 2 == 0) {
                    suma += array[i][j];
                }
            }
        }
        System.out.println("Cуммa четных элементов стоящих над побочной диагональю (не включительно): " + suma);
    }
}