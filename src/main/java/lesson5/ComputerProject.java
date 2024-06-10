package src.main.java.lesson5;

import java.util.Random;

/*
В методе main в отдельном классе ComputerProject продемонстрировать работу с данным компьютером, используя методы из класса Computer.

 */
public class ComputerProject {
    public static void main(String[] args) {

        Computer computer = new Computer("Apple M2", "256 GB", "8 GB", 5);
        computer.showDescripton();
        computer.turnOn();
        computer.turnOff();
    }
}