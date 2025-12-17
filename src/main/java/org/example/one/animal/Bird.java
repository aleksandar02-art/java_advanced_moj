package org.example.one.animal;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Ciu CIu Ciu");
    }

    @Override
    public void fly() {
        System.out.println("I am bird and i am flying!");
    }
}
