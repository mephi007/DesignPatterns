package org.example.StrategyPattern;

public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {
    }
    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.flyBehavior = fb;
        this.quackBehavior = qb;
    }
    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }
}
