package org.example.DecoratorPattern;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        this.description = "House Blend";
    }

    public HouseBlend(Size s){
        this.description = "House Blend";
        this.size = s;
    }

    public double cost(){
        double cost = 0.89;
        Size size = this.getSize();
        if(size == Size.GRANDE){
            cost = 2*cost;
        }else if (size == Size.VENTI){
            cost = 3*cost;
        }
        return cost;
    }
}
