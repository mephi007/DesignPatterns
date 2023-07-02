package org.example.ElevatorSystem;

public class ElevatorCar {
    int id;
    ElevatorDisplay display;
    int currentFloor;
    Direction direction;
    ElevatorStatus status;
    InternalButton internalButton;
    ElevatorDoor door;

    public ElevatorCar(int id){
        this.id = id;

    }
}
