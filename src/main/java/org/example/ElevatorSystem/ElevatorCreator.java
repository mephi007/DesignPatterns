package org.example.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllerList = new ArrayList();
    static{
         ElevatorCar elevatorCar1 = new ElevatorCar(1);
         ElevatorController controller1 = new ElevatorController(elevatorCar1);
         elevatorControllerList.add(controller1);

    }
}
