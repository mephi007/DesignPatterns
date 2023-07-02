package org.example.ElevatorSystem;

import java.util.List;

public class Building {
    List<Floor> floorList;
    public Building(List<Floor> floorList){
        this.floorList = floorList;
    }

    public void addFloor(Floor newFloor){
        floorList.add(newFloor);
    }

    public void remove(Floor floor){
        floorList.remove(floor);
    }

    public List<Floor> getFloorList(){
        return this.floorList;
    }
}
