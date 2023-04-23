package org.example.DecoratorPattern;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        double cost = 0.20;
        Size size = beverage.getSize();
        if(size == Size.GRANDE){
            cost = 2*cost;
        }else if (size == Size.VENTI){
            cost = 3*cost;
        }
        return beverage.cost() + cost;
    }
}
