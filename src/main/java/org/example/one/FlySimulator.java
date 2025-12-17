package org.example.one;

import org.example.one.animal.Flyable;

public class FlySimulator {
    private Flyable flyable;

    public FlySimulator(Flyable flyable){
        this.flyable = flyable;
    }

    public void simulatorFlying(){
        this.flyable.fly();
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
}
