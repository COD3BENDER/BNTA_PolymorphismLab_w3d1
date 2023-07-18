package models;

public class Car extends Vehicle{

    private int noOfDoors;
    private boolean isConvertible;
    private String carMake;

    public Car(int noOfDoors, boolean isConvertible, String carMake){
        super("BMW",10,0,"Petrol","Land",false,5000, 210);
        this.noOfDoors = noOfDoors;
        this.isConvertible = isConvertible;
        this.carMake = carMake;
    }

    public String isItConvertible(){
        if(this.isConvertible){
            return "The " + this.vehicleName + " has a convertible roof.";
        }else {
            return "The " + this.vehicleName + " does not have a convertible roof.";
        }
    }

    @Override
    public String moveVehicle() {
        return super.moveVehicle() + this.travelType + " with " + this.noOfDoors + " doors.";
    }

    public String topSpeed(){
        return "The" + this.vehicleName + "has a top speed of " + this.topSpeed + " mph";
    }
}
