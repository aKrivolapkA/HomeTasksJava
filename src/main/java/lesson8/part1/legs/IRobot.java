package src.main.java.lesson8.part1.legs;

public interface IRobot {
    default void action() {

    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    default int getPrice() {
        return 0;
    }


}
