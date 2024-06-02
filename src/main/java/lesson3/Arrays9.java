package src.main.java.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Пользователь должен указать с клавиатуры положительное число,а программа должна создать массив указанного размера из случайных целых чисел из [0;15]
и вывести его на экран в строку.
После этого программа должна определить и сообщить пользователю о том, сумма какой половины массива больше  : левой или правой, либо сообщить, что эти суммы модулей равны.
Если пользователь введёт неподходящее число, то выдать соответствующее сообщение

 */
public class Arrays9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Просьба ввести размер массива");
        int size = scanner.nextInt();
        int[] arrays = new int[size];

        if (size <= 0 || size % 2 != 0) {
            System.out.println("Вы ввели неверное число, просьба ввеси число четное и больше еденицы");
            System.exit(1);
        }
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(15);
        }

        int halfSize = arrays.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arrays, 0, halfSize);
        int[] rightHalf = Arrays.copyOfRange(arrays, halfSize, arrays.length);
        System.out.println("Массив " + Arrays.toString(arrays));

        int sumLeft = 0;
        for (int num : leftHalf) {
            sumLeft += num;
        }

        int sumRight = 0;
        for (int num : rightHalf) {
            sumRight += num;
        }
        if (sumLeft>sumRight){
            System.out.println("Левая часть массива больше чем правая.");
        } else if (sumLeft==sumRight) {
            System.out.println("Левая  и правая часть массива одинаковые.");
        }else {
            System.out.println("Правая часть массива больша.");
        }
    }
}