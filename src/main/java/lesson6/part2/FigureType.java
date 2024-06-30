package src.main.java.lesson6.part2;

public enum FigureType {

    CIRCLE(true),
    RECTANGLE(false),
    SQUARE(false);

    FigureType(boolean round) {
        this.round = round;
    }

    private boolean round;

    public boolean isRound() {
        return round;
    }
    //  for (FigureType type : values()) {
     //      if (type.getFigura().equals(CIRCLE)) {
     //          System.out.println("тут");
     //          return true;
     //      }
     //  }
     //  System.out.println("тут два раза ");
     //  return false;



    // public boolean isRound() {
    //     for(FigureType type :values()){
    //         if(type.getFigura().equals(CIRCLE)){
    //             System.out.println("тут");
    //             return true;
    //         }
    //     }
    //     System.out.println("тут два раза ");
    //     return false;
    // }

}
