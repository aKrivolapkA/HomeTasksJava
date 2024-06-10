package src.main.java.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
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

        int[][] array2 = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array2[j][i] = array[i][j];
            }
        }

        System.out.println("Транспонированная матрица: ");
        for (int[] element : array2) {
            System.out.println(Arrays.toString(element));
        }
    }
}