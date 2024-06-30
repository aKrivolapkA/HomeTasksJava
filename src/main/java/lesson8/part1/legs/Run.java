package src.main.java.lesson8.part1.legs;

import src.main.java.lesson8.part1.legs.Robot;
import src.main.java.lesson8.part1.legs.hands.SamsungHand;
import src.main.java.lesson8.part1.legs.hands.SonyHand;
import src.main.java.lesson8.part1.legs.heads.SamsungHead;
import src.main.java.lesson8.part1.legs.heads.SonyHead;
import src.main.java.lesson8.part1.legs.heads.ToshibaHead;
import src.main.java.lesson8.part1.legs.SamsungLeg;
import src.main.java.lesson8.part1.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robot1 = new Robot(new SamsungHead(),new SonyHand(), new ToshibaLeg());
        Robot robot2 = new Robot(new SonyHead(),new SamsungHand(), new ToshibaLeg());
        Robot robot3 = new Robot(new ToshibaHead(),new SonyHand(), new SamsungLeg());
        robot1.action();
        System.out.println("----------------");
        robot2.action();
        System.out.println("----------------");
        robot3.action();
        System.out.println("----------------");

        int priceRobot1 = robot1.getPrice();
        int priceRobot2 = robot2.getPrice();
        int priceRobot3 = robot3.getPrice();

        System.out.println("цена 1 робота: " +  priceRobot1);
        System.out.println("цена 2 робота: " +  priceRobot2);
        System.out.println("цена 3 робота: " +  priceRobot3);


         if( priceRobot1>priceRobot2 && priceRobot1>priceRobot3){
             System.out.println("Робот 1 самый дорогой");
         } else if (priceRobot2>priceRobot1&&priceRobot2>priceRobot3) {
             System.out.println("Робот 2 самый дорогой");
         } else if (priceRobot3>priceRobot1&&priceRobot3>priceRobot2) {
             System.out.println("Робот 3 самый дорогой");
         } else if (priceRobot1==priceRobot2) {
             System.out.println("Цена 1 и 2 робота одинаковая");
         }else if (priceRobot2==priceRobot3) {
             System.out.println("Цена 2 и 3 робота одинаковая");
         }else if (priceRobot3==priceRobot1) {
             System.out.println("Цена 1 и 3 робота одинаковая");
         }
    }
}
