package src.main.java.lesson9.part1;

public class MyException3 extends  MyException2 {
    public MyException3(){
        super();
    }

    /*
    Создайте метод threesome(), который будет ловить MyException, MyException2 и MyException3 в одном catch блоке.
     */

    public  static void threesome()  throws MyException,MyException2 { //MyException3  уже часть MyException2 поэтому нужно удалитьMyException3
    }

    public static void main(String[] args) throws  MyException,MyException2 {
        try {
            threesome();
        } catch (MyException | MyException2 e) {
            System.out.println(e.getMessage());
        }
    }
}