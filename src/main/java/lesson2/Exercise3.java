package src.main.java.lesson2;
/*
Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
Вывести полученное число.
 */
public class Exercise3 {
    public static void main(String[] args) {

        int number = -3;
        if (number > 0) {
            number++;
            System.out.println("Твое новое число " + number);
        } else if (number < 0) {
            number = number - 2;
            System.out.println("Твое новое число " + number);
        } else if (number == 0) {
            number = 10;
            System.out.println("Твое новое число " + number);
        }
    }
}