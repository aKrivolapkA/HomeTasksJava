package src.main.java.lesson9;

import java.sql.Array;
import java.util.Arrays;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    /*
    2. Создайте метод println(String s), который будет выбрасывать MyException с параметром s,
     а потом ловить это исключение и выводить параметр s. Выводите перенос строки в секции finally.
     */
    public static void println(String s) throws MyException {
        try {
            throw new MyException(s);
        } finally {
            System.out.println();
        }
    }

    /*
    3. Создайте метод nullPointer(), который будет создавать объект (любой), и
     нициализировать его null, пытаться вызвать метод у этого объекта,
     ловить NullPointerException и выводить в catch блоке сообщение "NullPointerException thrown successfully".
    */
    public static void nullPointer() throws NullPointerException {
        String x = null;
        try {
            x.length();
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException thrown successfully");
        }
    }

    /*
    4. Создайте методы f() и g(), так чтобы f() вызывал метод g().
     В методе g() выбросите MyException,
     словите его в методе f(),
     и там же в catch блоке поделите 1 на 0.
      Проверьте, что при вызове этого метода вылетает ArithmeticException.
     */
    public static void g() throws MyException {
        throw new MyException("This is MyException ");
    }


    public static void f() throws MyException {
        try {
            g();
        } catch (MyException ex) {
            // System.out.println( "ex в методе f "+ ex.getMessage());
            int test = 1 / 0;
        }
    }

    /*
    5. Создайте метод wrapException(Exception e),
    который будет возвращать RuntimeException, созданный с аргументом е в конструкторе.
     */

    public static RuntimeException wrapException(Exception e) {
        return new RuntimeException();
    }

    //public static void main(String[] args) {
    //    try {
    //        throw wrapException(new Exception("test message"));
    //    } catch (RuntimeException ex) {
    //        System.out.println(ex.getMessage());
    //    }
    //}

    /*
     Повторите упражнение 4, но в методе g() оберните MyException в RuntimeException, используя метод из упражнения 5. Почувствуйте разницу.
     */

    public static void g1() {
        try {
            throw new MyException("This is MyException");
        } catch (MyException e) {
            throw wrapException(e);
        }
    }


    public static void f1() {
        try {
            g1();
        } catch (RuntimeException ex) {
            System.out.println("ex в методе f " + ex.getMessage());
            System.out.println("original ex " + ex.getCause());
            int test = 1 / 0;
        }
    }

    /*
    7. Создайте метод unwrapException(Exception e), который будет выбрасывать сause исключения e.
     */
    public static void unwrapException(Exception e) {
        try {
            throw new MyException("This is MyException");
        } catch (Exception ex) {
            System.out.println(e.getCause());
        }
    }

    //  public static void main(String[] args) {
    //     unwrapException( new Exception());
    //
    //  }
    /*
   8 Создайте метод generateArrayOutOfBoundsException(int i),
    который будет пытаться обратиться к i-му элементу массива и выбрасывать исключение, потому что такого элемента в массиве нет.
     */
    public static void generateArrayOutOfBoundsException(int i) {
        int[] arrays = {1, 2, 3, 4, 5};
        try {
            arrays[5] = 44;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        generateArrayOutOfBoundsException(1);
    }


}

