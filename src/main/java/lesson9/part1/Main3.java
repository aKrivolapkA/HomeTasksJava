package src.main.java.lesson9.part1;

import static src.main.java.lesson9.part1.MyException.f;

public class Main3 {
    public static void main(String[] args) throws MyException{
       try {
           f();
       } catch (ArithmeticException e) {
           System.out.println("ArithmeticException перехвачено в main: " + e.getMessage());
       }

    }
}
