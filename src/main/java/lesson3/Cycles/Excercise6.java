package src.main.java.lesson3.Cycles;
/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно

 */
public class Excercise6 {
    public static void main(String[] args) {

        for (int i = 2; i <=100 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}