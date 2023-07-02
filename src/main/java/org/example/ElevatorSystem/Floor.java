package org.example.ElevatorSystem;

public class Floor {
    int floorNum;
    ExternalDispatcher externalDispatcher;
    public Floor(int floorNum){
        this.floorNum = floorNum;
        externalDispatcher = new ExternalDispatcher();
    }
    public void pressButton(Direction direction){
        externalDispatcher.submitExternalRequest(this.floorNum, direction);
    }
}
