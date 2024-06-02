package src.main.java.lesson3.Cycles;

/*
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

 */
public class Excercise5 {
    public static void main(String[] args) {
        double num = 1;

        for (int i = 1; i <= 20; i++) {
            num = i * 2.54;
            System.out.println( i+" cm это " + num +" дюймов");

        }
    }
}