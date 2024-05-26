package src.main.java.lesson2;

public class Exercise3 {
    public static void main(String[] args) {

        int number = 3;
        if (number > 0) {
            number++;
            System.out.println("Твое новое число " + number);
        } else if (number < 0) {
            number = number + 2;
            System.out.println("Твое новое число " + number);
        } else if (number == 0) {
            number = 10;
            System.out.println("Твое новое число " + number);
        }
    }
}