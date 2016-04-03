package kz.tezdet.lessons.spring.impl.toshiba;


import kz.tezdet.lessons.spring.interfaces.Leg;

public class ToshibaLeg implements Leg {
    public void go() {
        System.out.println("Go to Toshiba!");
    }
}
