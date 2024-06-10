package src.main.java.lesson3.Array;

import java.util.Arrays;
import java.util.Random;

/*
Создайте массив из 20 случайных целых чисел из отрезка [0;20].
 Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.  Снова выведете массив на экран на отдельной строке.
 */
public class Arrays4 {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(20);
        }
        System.out.println("Вывод массива на экран в строку: "+ Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Вывод массива на экран с заменой на ноль: "+ Arrays.toString(array));
    }
}