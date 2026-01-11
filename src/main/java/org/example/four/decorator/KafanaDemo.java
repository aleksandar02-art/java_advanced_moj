package org.example.four.decorator;

public class KafanaDemo {
    public static void main(String[] args) {
        Caffe caffe = new Caffe();
        consume(caffe);
        Tea tea = new Tea();
        consume(tea);

        Beverage beverage = new MilkBeverageDecorator(new Caffe());
        consume(beverage);

        Beverage picence = new WhiskeyBeverageDecorator(new Tea());
        consume(picence);

        Beverage novoPice = new WhiskeyBeverageDecorator(new Caffe());
        consume(novoPice);

        Beverage najnovijePice = new WhiskeyBeverageDecorator(new MilkBeverageDecorator(new Caffe()));
        consume(najnovijePice);

    }

    static void consume(Beverage beverage){
        System.out.println(beverage.name() + " kosta " + beverage.cost());
    }
}
