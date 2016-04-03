package kz.tezdet.lessons.spring.impl.toshiba;

import kz.tezdet.lessons.spring.interfaces.Hand;


public class ToshibaHand implements Hand {
    public void catchSomthing() {
        System.out.println("Catched from Sony!!");
    }
}
