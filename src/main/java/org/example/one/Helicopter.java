package org.example.one;

import org.example.one.animal.Flyable;

public class Helicopter implements Flyable{
    @Override
    public void fly() {
        System.out.println("I am Helicopter and I am flying!");
    }
}
