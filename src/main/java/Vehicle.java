public abstract class Vehicle {
    protected int numberOfWheels;
    protected int maximumOccupancy;
    protected String fuelType;
    protected String travelType;
    protected boolean publicTravel;
    protected int price;

    public Vehicle(int numberOfWheels, int maximumOccupancy, String fuelType,String travelType, boolean publicTravel, int price){
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.fuelType = fuelType;
        this.travelType = travelType;
        this.publicTravel = publicTravel;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String moveVehicle(){
        return "This vehicle operates on: ";

    }
}
