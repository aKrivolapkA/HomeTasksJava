package src.main.java.lesson3;

import java.util.Arrays;
import java.util.Random;

/*
Создайте массив из 15 случайных целых чисел из отрезка [0; 99].
Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.


 */
public class Arrays3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int sumEvenNumber = 0;
        int sumOddNumber = 0;

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                sumEvenNumber++;
            } else {
                sumOddNumber++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество чётных элементов: " + sumEvenNumber);
        System.out.println("Количество нечётных элементов: " + sumOddNumber);
    }
}