package org.example.StrategyPattern;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
//        super(new FlyWithWings(), new Quack());
    }
    public void display(){
        System.out.println("Mallard Duck");
    }
}
