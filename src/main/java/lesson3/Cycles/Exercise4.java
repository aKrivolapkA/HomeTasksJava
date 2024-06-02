package src.main.java.lesson3.Cycles;

import java.util.Scanner;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        int a= scanner.nextInt();
        if (a<0){
            System.out.println("неверное значение");
            System.exit(1);
        }
        System.out.println("input b");

        int b =scanner.nextInt();
        if (a<0){
            System.out.println("неверное значение");
            System.exit(1);
        }

        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}