package models;

public class Plane extends Vehicle{

    private int noOfWings;
    private String serviceType;
    private boolean supersonic;

    public Plane(int noOfWings, String serviceType, boolean supersonic){
        super("Boeing 747",10,242,"Aviation fuel","Air",true, 200000, 1110);
        this.noOfWings = noOfWings;
        this.serviceType = serviceType;
        this.supersonic = supersonic;


    }
    public String isSupersonic(){
        if(this.supersonic){
            return "The " + this.vehicleName + " is supersonic.";
        }else {
            return "The " + this.vehicleName + " is not supersonic.";
        }
    }
    @Override
    public String moveVehicle() {
        return super.moveVehicle() + this.travelType;
    }

    public String topSpeed(){
        return "The" + this.vehicleName + "has a top speed of " + this.topSpeed + " Km/h";
    }
}
