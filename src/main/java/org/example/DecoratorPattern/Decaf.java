package org.example.DecoratorPattern;

public class Decaf extends Beverage{
    public Decaf() {
        this.description = "Decaf";
    }

    public Decaf(Size s){
        this.description = "Decaf";
        this.size = s;
    }

    public double cost(){
        double cost = 1.05;
        Size size = this.getSize();
        if(size == Size.GRANDE){
            cost = 2*cost;
        }else if (size == Size.VENTI){
            cost = 3*cost;
        }
        return cost;
    }
}
