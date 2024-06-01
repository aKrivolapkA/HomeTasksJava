package src.main.java.lesson3;

import java.util.Arrays;
import java.util.Random;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
 выведите массивы на экран в двух отдельных строках.
 Посчитайте среднее арифметическое элементов каждого массива и
 сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

 */
public class Arrays5 {
    public static void main(String[] args) {
        Random random = new Random();
        double sum1 = 0;
        double sum2 = 0;

        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(15);
            sum1 += array1[i];
        }
        double  meanArray1 = (double) sum1 / array1.length;

        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(15);
            sum2 += array2[i];
        }
        double  meanArray2 = sum2 / array2.length;

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));

        if (meanArray1 == meanArray2) {
            System.out.println(" среднee арифметическое значение для двух массивов раво");
        } else if (meanArray1 > meanArray2) {
            System.out.println("Среднее арифметическое значение первого масства больше");
        } else {
            System.out.println("Среднее арифметическое значение второго масства больше");
        }
    }
}