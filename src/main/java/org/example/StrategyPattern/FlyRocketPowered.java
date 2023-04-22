package org.example.StrategyPattern;

public class FlyRocketPowered implements FlyBehavior {

    public void fly(){
        System.out.println("Flying using Rocket Power");
    }
}
