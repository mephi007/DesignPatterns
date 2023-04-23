package org.example.DecoratorPattern;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }
    public double cost(){
        double cost = 0.10;
        Size size = beverage.getSize();
        if(size == Size.GRANDE){
            cost = 2*cost;
        }else if(size == Size.VENTI){
            cost = 3*cost;
        }
        return beverage.cost() + cost;
    }
}
