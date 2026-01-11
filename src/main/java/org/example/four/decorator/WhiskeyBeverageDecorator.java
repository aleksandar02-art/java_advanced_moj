package org.example.four.decorator;

public class WhiskeyBeverageDecorator extends BeverageDecorator{
    public WhiskeyBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name() + " sa viskijem";
    }

    @Override
    public double cost() {
        return beverage.cost() + 20.4;
    }
}
