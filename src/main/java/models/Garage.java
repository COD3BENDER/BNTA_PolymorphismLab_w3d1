package models;

import interfaces.ICost;

import java.util.ArrayList;

public class Garage implements ICost {

    private ArrayList<Vehicle> fixVehicles;
    private int partsCost;

    public Garage(int partsCost){
        this.fixVehicles = new ArrayList<>();
        this.partsCost = partsCost;
    }

    public ArrayList<Vehicle> getFixVehicles() {
        return fixVehicles;
    }

    public void addFixVehicles(Storage fixVehicles, String VehicleName) {

        for (int i = 0; i < fixVehicles.getVehicles().size(); i++) {
            if (VehicleName.equals(fixVehicles.getVehicles().get(i).getVehicleName())) {
                this.fixVehicles.add(fixVehicles.getVehicles().get(i));
            }
        }
    }

    public int totalCost(){
        int totalCost = 0;
        for (int i = 0; i < fixVehicles.size(); i++) {
            totalCost += (((fixVehicles.get(i).getPrice() * 10)/100) + partsCost);


        }
        return totalCost ;
    }
}
