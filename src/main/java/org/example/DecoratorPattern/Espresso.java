package org.example.DecoratorPattern;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    public Espresso(Size s){
        this.description = "Espresso";
        this.size = s;
    }

    @Override
    public double cost() {
        double cost = 1.99;
        Size size = this.getSize();
        if(size == Size.GRANDE){
            cost = 2*cost;
        }else if (size == Size.VENTI){
            cost = 3*cost;
        }
        return cost;
    }
}
