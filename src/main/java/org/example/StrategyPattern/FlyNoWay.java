package org.example.StrategyPattern;

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("cant fly");
    }
}
