package src.main.java.lesson3;

import java.util.Arrays;
import java.util.Random;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
 Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

 */
public class Arrays8 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(9);
        }

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(9);
        }

        double[] array3 = new double[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (double) array1[i] / (double) array2[i];
            if (array2[i] == 0) {
                System.out.println("Произошла ошибка.  На ноль делить нельзя.Массив не будет до конца правильный. Просьба повторить попытку");
                break;
            }
        }
        System.out.println("Первый массив: "+Arrays.toString(array1));
        System.out.println("Второй массив: "+Arrays.toString(array2));
        System.out.println("Третий массив: "+Arrays.toString(array3));
    }
}