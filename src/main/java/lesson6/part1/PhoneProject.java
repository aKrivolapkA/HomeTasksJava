package src.main.java.lesson6.part1;

public class PhoneProject {
    public static void main(String[] args) {
        Phone phone1 = new Phone(111, "Iphone", 24.5);
        Phone phone2 = new Phone(222, "Samsung", 25.5);
        Phone phone3 = new Phone(333, "LG", 20.5);

        System.out.println(phone1.getNumber());
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();
    }
    @Override
    public void receiveCall(String name) {
        System.out.println("Звонит" + name);
    }

}
