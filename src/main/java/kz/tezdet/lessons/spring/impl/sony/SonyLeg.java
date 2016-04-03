package kz.tezdet.lessons.spring.impl.sony;

import kz.tezdet.lessons.spring.interfaces.Leg;


public class SonyLeg implements Leg {
    public void go() {
        System.out.println("Go to Sony!");
    }
}
