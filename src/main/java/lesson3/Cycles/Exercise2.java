package src.main.java.lesson3.Cycles;

/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

 */
public class Exercise2 {
    public static void main(String[] args) {
        int kletki = 1;

        for (int i = 3; i <= 24;i += 3 ) {
            kletki*=2;
            System.out.println("Через " + i + " часов будет " + kletki + " молекул");

        }
    }
}