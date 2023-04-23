package org.example.DecoratorPattern;

public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost(){
        double cost = 0.10;
        Size size = beverage.getSize();
        if(size == Size.GRANDE){
            cost = 2*cost;
        }else if (size == Size.VENTI){
            cost = 3*cost;
        }
        return beverage.cost() + cost;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
