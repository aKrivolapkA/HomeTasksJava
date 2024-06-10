package src.main.java.lesson3.Cycles;

/*
Вычислить: 1+2+4+8+…+256
 */
public class Exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 256) {
            sum = sum + number;
            number = number * 2;
        }
        System.out.println("Сумма чисел " + sum);
    }
}