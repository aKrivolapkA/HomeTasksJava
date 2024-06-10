package src.main.java.lesson3.Cycles;

/*
Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?

 */
public class Exercise1 {
    public static void main(String[] args) {
        int km = 10;
        double result = km;

        for (int day = 2; day <=7 ; day++) {
            km*=1.1;
            result+=km;
        }

        System.out.println("Суммарный путь "+ result+ " км.");
    }
}
