package src.main.java.lesson3.Array;

import java.util.Arrays;
import java.util.Random;

/*
Создайте массив из 4 случайных целых чисел из отрезка [0;10],
выведите его на экран в строку.
 Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

 */
public class Arrays6 {
    public static void main(String[] args) {

        int[] array = new int[4];
        Random random=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(10);
        }
        System.out.println("Массив в строку: "+ Arrays.toString(array));

        if (array[0]<array[1] &&array[1]<array[2]){
            System.out.println("массив является  строго возрастающей последовательностью.");
        }else {
            System.out.println("массив не является  строго возрастающей последовательностью");
        }
    }
}