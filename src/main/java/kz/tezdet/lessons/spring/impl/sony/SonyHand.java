package kz.tezdet.lessons.spring.impl.sony;

import kz.tezdet.lessons.spring.interfaces.Hand;

public class SonyHand implements Hand {
    public void catchSomthing() {
        System.out.println("Catched from Sony!!");
    }
}
