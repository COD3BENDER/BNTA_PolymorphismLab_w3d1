package models;

import interfaces.ICost;

public class Garage implements ICost {

    private Storage storedVehicles;
    private String vehicleName;
    private int partsCost;
    private int totalCost;

    public Garage(String vehicleName, int partsCost){
        this.storedVehicles = new Storage();
        this.vehicleName = vehicleName;
        this.partsCost = partsCost;
        this.totalCost = 0;
    }

    public int totalCost(){
        for (int i = 0; i < storedVehicles.getVehicles().size(); i++) {
            if(storedVehicles.getVehicles().get(i).getVehicleName().equals(this.vehicleName)){
               totalCost= (int) (storedVehicles.getVehicles().get(i).getPrice() * 0.1 + this.partsCost);
            }

        }
        return totalCost;
    }
}
