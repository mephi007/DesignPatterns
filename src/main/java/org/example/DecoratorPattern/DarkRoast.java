package org.example.DecoratorPattern;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark Roast";
    }

    public DarkRoast(Size s){
        this.description = "Dark Roast";
        this.size = s;
    }

    public double cost(){
        double cost = 0.99;
        Size size = this.getSize();
        if(size == Size.GRANDE){
            cost = 2*cost;
        }else if (size == Size.VENTI){
            cost = 3*cost;
        }
        return cost;
    }
}
