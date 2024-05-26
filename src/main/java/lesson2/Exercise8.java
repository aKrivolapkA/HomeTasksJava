package src.main.java.lesson2;

public class Exercise8 {
    public static void main(String[] args) {
        int x = 9;
        x++;
        System.out.println(x);

        int y = 21;
        y--;
        System.out.println(y);

        boolean result1 = false & false;
        boolean result2 = false & true;
        boolean result3 = true & false;
        boolean result4 = true & true;

        boolean result5 = false | false;
        boolean result6 = false | true;
        boolean result7 = true | false;
        boolean result8 = true | true;

        boolean result9 = false ^ false;
        boolean result10 = false ^ true;
        boolean result11 = true ^ false;
        boolean result12 = true ^ true;


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);
        System.out.println(result11);
        System.out.println(result12);

    }
}