package src.main.java.lesson8.part3;

import java.util.Random;

public class SpaceX implements iStart{
    @Override
    public boolean preLaunchSystemCheck() {
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        if (randomNumber %2== 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели SpaceX запущены.\n Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");

    }
}
