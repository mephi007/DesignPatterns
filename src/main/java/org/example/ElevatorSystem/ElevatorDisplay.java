package org.example.ElevatorSystem;

public class ElevatorDisplay {
    int currentFloor;
    Direction direction;

    public ElevatorDisplay(int floor, Direction direction){
        this.currentFloor = floor;
        this.direction = direction;
    }

    public void showDisplay(){
        String display = "lift is at " + this.currentFloor + " going " + direction.toString();
    }
}
