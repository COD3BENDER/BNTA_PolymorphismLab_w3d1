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

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public boolean isPublicTravel() {
        return publicTravel;
    }

    public void setPublicTravel(boolean publicTravel) {
        this.publicTravel = publicTravel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String moveVehicle(){
        return "This vehicle operates on ";

    }
    public abstract String topSpeed();
}
