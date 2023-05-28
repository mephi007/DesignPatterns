package org.example.StatePattern;

public class GumballMachine {
    State soldOutSate;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count=0;

    public GumballMachine(int numberGumballs){
        this.count = numberGumballs;
        soldState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new  WinnerState(this);
        if(count > 0){
            state = noQuarterState;
        }else state = soldOutSate;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot ....");
        if(count>0){
            count--;
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public State getNoQuarterState() {
        return this.noQuarterState;
    }

    public State getSoldState() {
        return this.soldState;
    }

    public int getCount() {
        return this.count;
    }

    public State getSoldOutState(){
        return this.soldOutSate;
    }

    public State getWinnerState() {
        return this.winnerState;
    }
}
