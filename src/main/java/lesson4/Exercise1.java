package src.main.java.lesson4;
/*
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
Посчитать сумму четных элементов стоящих на главной диагонали.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
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

        int sumDiagonal = 0;
        for (int i = 0; i < size; i++) {
            if (array[i][i] % 2 == 0) {
                sumDiagonal += array[i][i];
            }
        }
        System.out.println("\nСумма четных чисел по диагонали: " + sumDiagonal);
    }
}