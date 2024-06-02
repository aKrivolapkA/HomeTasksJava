package src.main.java.lesson3.Array;

import java.util.Arrays;
import java.util.Random;

/*
Создайте массив из 12 случайных целых чисел из отрезка [0;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

 */
public class Arrays7 {
    public static void main(String[] args) {
        int index =0;

        int[] array = new int[12];
        int maxValue = array[0];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);

            if (array[i]>maxValue) {
                maxValue = array[i];
                index=i;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Mаксимальное значение: "+ maxValue + ", "+"индекс: " + index);
    }
}