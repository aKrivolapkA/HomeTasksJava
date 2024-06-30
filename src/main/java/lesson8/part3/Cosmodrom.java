package src.main.java.lesson8.part3;

public class Cosmodrom implements iStart {

    public void start(iStart iStart) {
        if (!iStart.preLaunchSystemCheck()) {
            System.out.println("Предстартовая проверка провалена");
            System.exit(1);
        }
        startingEngines();
        System.out.println("10\n9\n8\n7\n6\n5\n4\n3\n2\n1\n");
        start();
    }

    @Override
    public boolean preLaunchSystemCheck() {
        return false;
    }

    @Override
    public void startingEngines() {
    }

    @Override
    public void start() {
    }
}