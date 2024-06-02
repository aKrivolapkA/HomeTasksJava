package src.main.java.lesson3.Array;

public class Arrays2 {
    public static void main(String[] args) {
        /*
        Создайте массив из всех нечётных чисел от 1 до 99,
        выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
         */
        int[] array = new int[100];
        System.out.println("Элементы в строку:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = i;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Элементы в столбик в обратном порядке :");
        for (int i = array.length; i >= 0; i--) {
            if (i % 2 != 0) {
                array[i] = i;
                System.out.println(array[i]);
            }
        }
    }
}