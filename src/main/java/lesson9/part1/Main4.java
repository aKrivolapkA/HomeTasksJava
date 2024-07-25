package src.main.java.lesson9.part1;

import static src.main.java.lesson9.part1.MyException.f;
import static src.main.java.lesson9.part1.MyException.f1;

public class Main4 {
    public static void main(String[] args) throws MyException{

       try {
           f();
       } catch (ArithmeticException e) {
           System.out.println("ArithmeticException перехвачено в main: " + e.getMessage());
       }

//   Повторите упражнение 4
        try {
            f1();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException перехвачено в main: " + e.getMessage());
        }
    }
}
