package kz.tezdet.lessons.spring.impl.robot;


import kz.tezdet.lessons.spring.interfaces.Hand;
import kz.tezdet.lessons.spring.interfaces.Head;
import kz.tezdet.lessons.spring.interfaces.Leg;
import kz.tezdet.lessons.spring.interfaces.Robot;

public class ModelT1000 extends BaseModel {

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }


    public ModelT1000(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnabled) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public void action() {
        getHead().calc();
        getHand().catchSomthing();
        getLeg().go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
