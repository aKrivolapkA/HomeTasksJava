package src.main.java.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
 Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
 Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
 Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

 */
public class Arrays10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое больше 3: ");
        int n = scanner.nextInt();
        if (n <= 3) {
            System.out.println("Вы ввели неверное число, просьба повторить попытку");
            System.exit(1);
        }
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
        }

        int sizeNewArray = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sizeNewArray++;
            }
        }

        int[] array2 = new int[sizeNewArray];

        int index = 0;
        for (int num2 : array) {
            if (num2 % 2 == 0) {
                array2[index++] = num2;
            }
        }
        System.out.println(" Первый массив: " + Arrays.toString(array));
        System.out.println(" Второй массив: " + Arrays.toString(array2));

    }

}