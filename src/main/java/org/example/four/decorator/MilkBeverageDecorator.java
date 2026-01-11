package org.example.four.decorator;

public class MilkBeverageDecorator extends BeverageDecorator{

    public MilkBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name() + " sa mlekom";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
