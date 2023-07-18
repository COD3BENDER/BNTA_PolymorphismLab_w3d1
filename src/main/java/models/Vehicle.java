package models;

public abstract class Vehicle {
    protected String vehicleName;
    protected int numberOfWheels;
    protected int maximumOccupancy;
    protected String fuelType;
    protected String travelType;
    protected boolean publicTravel;
    protected int price;

    protected int topSpeed;

    public Vehicle(String vehicleName,
                   int numberOfWheels,
                   int maximumOccupancy,
                   String fuelType,
                   String travelType,
                   boolean publicTravel,
                   int price, int topSpeed){

        this.vehicleName = vehicleName;
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.fuelType = fuelType;
        this.travelType = travelType;
        this.publicTravel = publicTravel;
        this.price = price;
        this.topSpeed = topSpeed;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getPrice() {
        return price;
    }

    public String moveVehicle(){
        return "This vehicle operates on: ";

    }
    public abstract String topSpeed();
}
