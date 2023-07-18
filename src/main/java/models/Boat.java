package models;

public class Boat extends Vehicle{

    boolean hasSail;
    boolean hasEngine;

    public Boat(boolean hasSail, boolean hasEngine){
        super("Atlantis",0,6,"Diesel","Sea",false,25000, 250);
        this.hasSail = hasSail;
        this.hasEngine = hasEngine;

    }
    public String propulsionType(){
        if(this.hasSail && this.hasEngine){
            return "The " + this.vehicleName + " has a both an engine and a sail.";
        }else if (this.hasEngine){
            return "The " + this.vehicleName + " has an Engine.";
        }else {
            return "The " + this.vehicleName + " has a sail.";
        }
    }

    @Override
    public String moveVehicle() {
        return super.moveVehicle() + this.travelType;
    }

    public String topSpeed(){
        return "The" + this.vehicleName + "has a top speed of " + this.topSpeed + " MPH";
    }
}
