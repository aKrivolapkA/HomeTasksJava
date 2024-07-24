package src.main.java.lesson6.part1;

import java.util.Date;

public class Phone {
    private String number;
    private String model;
    private String weight;


    //конструктор  который принимает на вход два параметра
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //конструктор без параметров.
    public Phone() {
    }

    //Вызвать из конструктора с тремя параметрами конструктор с двумя TODO  из-за этого конструктора выскакивает ошибка
     public Phone(String number, String model, String weight) {
         this(number,model);
         this.weight = weight;
     }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    public void printInfo() {
        System.out.println("number " + number + " model " + model + " weight " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + "Номер : " + number);
    }

    private void sendMessage(String... numbers) {
        System.out.println("отправка сообщения");

    }

}