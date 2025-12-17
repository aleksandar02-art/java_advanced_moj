package org.example.one;

import org.example.one.animal.Bird;
import org.example.one.beverage.Beverage;

public class Demo {
    public static void main(String[] args) {
//        Beverage beverage = new Beverage("Jelen") {
//            @Override
//            public double cost() {
//                return 0;
//            }
//        };
        Bird bird = new Bird("Papagaj");
        Plane plane = new Plane();

        Helicopter helicopter = new Helicopter();

        FlySimulator flySimulator = new FlySimulator(bird);
        flySimulator.simulatorFlying();
        flySimulator.setFlyable(plane);
        flySimulator.simulatorFlying();
        flySimulator.setFlyable(helicopter);
        flySimulator.simulatorFlying();
    }
}
