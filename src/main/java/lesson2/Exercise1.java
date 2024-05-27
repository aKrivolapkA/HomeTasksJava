package src.main.java.lesson2;
/*
В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
Например, "это однозначное положительное число".
Достаточно будет определить, является ли число однозначным, "двузначным или трехзначным и более.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int number = 8;

        if (number >= 0 && number <= 9) {
            System.out.println("Это однозначное положительное число");
        } else if (number > 9 && number <= 99) {
            System.out.println("Это  двухзначное положительное число");
        } else if (number > 99 && number <= 999) {
            System.out.println("Это трехзначное положительное число");
        } else if (number > 999) {
            System.out.println("Это  положительное число, в котором больше трех цифр");
        } else if (number < 0 && number >= -9) {
            System.out.println("Это  однозначное отрицательное число");
        } else if (number < -9 && number >= -99) {
            System.out.println("Это двухзначное отрицательное число");
        } else if (number < -99 && number >= -999) {
            System.out.println("Это трехзначное отрицательное число");
        } else if (number < -999) {
            System.out.println("Это  отрицательное число, в которои больше трех цифр ");
        }
    }
}