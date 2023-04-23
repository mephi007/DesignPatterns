package org.example.DecoratorPattern;

public class Soy extends CondimentDecorator{
        public Soy(Beverage beverage){
            this.beverage = beverage;
        }

    public double cost(){
        double cost = 0.15;
        Size size = beverage.getSize();
        if(size == Size.GRANDE){
            cost = 2*cost;
        }else if (size == Size.VENTI){
            cost = 3*cost;
        }
        return beverage.cost() + cost;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
