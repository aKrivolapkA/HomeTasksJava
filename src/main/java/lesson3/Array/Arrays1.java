package src.main.java.lesson3.Array;


public class Arrays1 {
    public static void main(String[] args) {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один элемент от другого пробелом,
     а затем в столбик (отделяя один элемент от другого началом новой строки).
     Перед созданием массива подумайте, какого он будет размера.
     */

        int size = 0;
        for (int i = 2; i < 20; i++)
            if (i % 2 == 0) {
                size++;
            }
        size++;

        System.out.println("размер массива: " + size);

        System.out.println("--------------------");

        int[] array1 = new int[size];
        for (int i = 0, number = 2; number <= size; number += 2, i++) {
            array1[i] = number;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i]);
        }
        System.out.println();
        System.out.println("--------------------");


        for (int number : array1) {
            System.out.println(number);
        }
    }

}

