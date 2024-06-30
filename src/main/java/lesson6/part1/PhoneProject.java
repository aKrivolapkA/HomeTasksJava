package src.main.java.lesson6.part1;

public class PhoneProject extends Phone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("111", "Iphone", "24.5");
        Phone phone2 = new Phone("111", "Samsung", "23.2");
        Phone phone3 = new Phone("333", "LG", "20.5");

        System.out.println("number 1: " + phone1.getNumber());
        System.out.println("number 2: " + phone2.getNumber());
        System.out.println("number 3: " + phone3.getNumber());


        phone1.receiveCall("Alex");
        phone2.receiveCall("Katia");
        phone2.receiveCall("Petia");

        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();
        phone1.receiveCall("Aleks ", "11222111");
        phone1.receiveCall("Aleksandra ", "333222111");
        phone2.receiveCall("Vasia ", "3344556");

    }

    @Override
    public void receiveCall(String name, String number) {
        super.receiveCall(name, number);
    }
}
