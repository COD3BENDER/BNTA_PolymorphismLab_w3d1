package models;

public class Boat extends Vehicle{

    boolean hasSail;
    boolean hasEngine;

    public Boat(boolean hasSail, boolean hasEngine){
        super("Atlantis",0,6,"Diesel","Water",false,250, 250);
        this.hasSail = hasSail;
        this.hasEngine = hasEngine;

    }
    public String propulsionType(){
        if(this.hasSail && this.hasEngine){
            return "The " + this.vehicleName + " has both an Engine and a Sail.";
        }else if (this.hasEngine){
            return "The " + this.vehicleName + " has an Engine.";
        }else if(this.hasSail){
            return "The " + this.vehicleName + " has a Sail.";
        }else {
            return "The " + this.vehicleName + " has no Sail or Engine.";
        }
    }

    @Override
    public String moveVehicle() {
        return super.moveVehicle() + this.travelType;
    }

    public String topSpeed(){
        return "The " + this.vehicleName + " has a top speed of " + this.topSpeed + " mph.";
    }
}
