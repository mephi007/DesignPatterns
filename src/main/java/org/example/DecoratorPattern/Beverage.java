package org.example.DecoratorPattern;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size = Size.TALL;
    public String getDescription(){
        return description;
    }
    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }
    public abstract double cost();
}
