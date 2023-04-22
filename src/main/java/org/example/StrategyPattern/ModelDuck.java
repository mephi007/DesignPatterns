package org.example.StrategyPattern;

public class ModelDuck extends Duck {

    public ModelDuck(){
//        FlyBehavior flyBehavior = new FlyNoWay();
//        QuackBehavior quackBehavior = new MutedQuack();
        super(new FlyNoWay(), new MutedQuack());
    }

    public void display(){
        System.out.println("Model Duck");
    }
}
