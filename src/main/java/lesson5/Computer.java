package src.main.java.lesson5;

import java.util.Random;
import java.util.Scanner;

/*
Методы:

- при превышении лимита ресурса комп сгорает

 */
public class Computer {
    private String processor;
    private String RAM;
    private String HDD;
    private int resourceOfFullCyclesOfOperation =0;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Computer(String processor, String RAM, String HDD, int resourceOfFullCyclesOfOperation) {
        this.processor = processor;
        this.RAM = RAM;
        this.HDD = HDD;
        this.resourceOfFullCyclesOfOperation = resourceOfFullCyclesOfOperation;
    }

    public void showDescripton() {
        System.out.println(" процессор: " + processor + " оперативка: " + RAM + " жесткий диск: " + HDD + " ресурс полных циклов работы: " + resourceOfFullCyclesOfOperation);
    }

    public void turnOn() {
         int randomNumber  = random.nextInt(2);
        System.out.println("Введите число 1 или 0: ");
        int number = scanner.nextInt();

        if (number > 1) {
            System.out.println("Вы ввели неверное значение.Повторите попыткуn");
            System.exit(1);
        } else if (number < 0) {
            System.out.println("Вы ввели неверное значение.Повторите попытку");
            System.exit(1);
        } else {
            System.out.println("Значение принято ");
        }
        if (number == randomNumber) {
            System.out.println("Ура! Вы угададали, комп включается");
        } else {
            System.out.println("о нет, комп сгорает.ему конец :(  ");
            System.exit(1);
        }
    }

    public void turnOff() {
        int randomNumber2 = random.nextInt(2);
        System.out.println("Введите число 1 или 0: ");
        int number2 = scanner.nextInt();
        if (number2 > 1) {
            System.out.println("Вы ввели неверное значение.Повторите попыткуn");
            System.exit(1);
        } else if (number2 < 0) {
            System.out.println("Вы ввели неверное значение.Повторите попытку");
            System.exit(1);
        } else {
            System.out.println("Значение принято ");
        }
        if (number2 == randomNumber2) {
            System.out.println("Ура! Вы угададали, комп выключается");
        } else {
            System.out.println("о нет, комп сгорает.ему конец :(  ");
        }
    }
}