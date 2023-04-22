package org.example.StrategyPattern;

public class MutedQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
