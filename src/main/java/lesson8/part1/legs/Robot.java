package src.main.java.lesson8.part1.legs;

import src.main.java.lesson8.part1.legs.IRobot;
import src.main.java.lesson8.part1.legs.hands.IHand;
import src.main.java.lesson8.part1.legs.heads.IHead;
import src.main.java.lesson8.part1.legs.ILeg;

public class Robot   implements IRobot{
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

   @Override
   public void action() {
       head.speek();
       hand.upHand();
       leg.step();
   }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head .getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
