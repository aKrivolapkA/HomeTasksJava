package src.main.java.lesson3.Cycles;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class Exercise7 {
    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + sum);
    }
}