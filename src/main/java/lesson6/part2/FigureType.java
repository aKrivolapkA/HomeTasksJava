package src.main.java.lesson6.part2;

public enum FigureType {

    CIRCLE(true),
    RECTANGLE(false),
    SQUARE(false);

    FigureType(boolean round) {
        this.round = round;
    }

    private final boolean round;

    public boolean isRound() {
        return round;
    }
}
