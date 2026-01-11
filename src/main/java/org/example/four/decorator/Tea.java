package org.example.four.decorator;

public class Tea implements Beverage{
    @Override
    public String name() {
        return "Caj";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
