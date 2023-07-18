package models;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Vehicle> vehicles;
    private int totalRent;

    public Storage(){
        vehicles = new ArrayList<>();
        this.totalRent = 0;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getTotalRent() {
        return totalRent;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove((vehicle));
    }

    public void calculateRent(){
        for (Vehicle vehicle : vehicles) {
            this.totalRent += (vehicle.getPrice() * 0.1);
        }
    }
}
