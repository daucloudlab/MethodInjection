package kz.tezdet.lessons.spring.impl.conveyer;


import kz.tezdet.lessons.spring.interfaces.Robot;

public abstract class RobotConveyer implements kz.tezdet.lessons.spring.interfaces.RobotConveyer{
    public abstract Robot createRobot();
}
