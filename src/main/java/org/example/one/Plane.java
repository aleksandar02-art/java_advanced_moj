package org.example.one;

import org.example.one.animal.Flyable;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("I am plane and I am flying!");
    }
}
