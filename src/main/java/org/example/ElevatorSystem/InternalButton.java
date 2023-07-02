package org.example.ElevatorSystem;

public class InternalButton {
    InternalDispatcher dispatcher = new InternalDispatcher();
    int[] availableFloors = {1,2,3,4,5,6,7,8,9,10};
    int buttonPressed;

    public void pressButton(int destination, ElevatorCar car){
        dispatcher.submitInternalRequest(destination, car);
    }

}
