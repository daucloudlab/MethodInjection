package kz.tezdet.lessons.spring.main;

import kz.tezdet.lessons.spring.impl.conveyer.RobotConveyer;
import kz.tezdet.lessons.spring.interfaces.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mainContext.xml") ;

        RobotConveyer conveyer = (RobotConveyer)context.getBean("t1000Conveyer") ;

        Robot terminator1 = conveyer.createRobot() ;
        Robot terminator2 = conveyer.createRobot();
        Robot terminator3 = conveyer.createRobot();

        System.out.println("terminator1 " + terminator1);
        System.out.println("terminator2 " + terminator2);
        System.out.println("terminator3 " + terminator3);


    }
}
