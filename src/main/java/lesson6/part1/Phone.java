package src.main.java.lesson6.part1;

public class Phone {
    private int number;
    private String model;
    private double weight;

    //конструктор  который принимает на вход три параметра
    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //конструктор  который принимает на вход два параметра
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    //конструктор без параметров.
    public Phone() {
    }

//Вызвать из конструктора с тремя параметрами конструктор с двумя?
    //  ??????


    public int getNumber() {
        return number;
    }
    //public String getModel() {
    //    return model;
    //}
    //public double getWeight() {
    //    return weight;
    //}

    public void printInfo() {
        System.out.println("number " + number + " model " + model + " weight " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит" + name);
    }
    private  void sendMessage (String...numbers){
        System.out.println("отправка сообщения");

    }
    /*
    Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два
параметра - имя звонящего и номер телефона звонящего. Вызвать этот
метод.

     */
}
