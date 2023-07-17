public class Car extends Vehicle{

    private int noOfDoors;
    private boolean isConvertible;
    private String carMake;

    public Car(int noOfDoors, boolean isConvertible, String carMake){
        super(10,0,"","Land",false,5000);
        this.noOfDoors = noOfDoors;
        this.isConvertible = isConvertible;
        this.carMake = carMake;
    }

    @Override
    public String moveVehicle() {
        return super.moveVehicle() + this.travelType + " with " + this.noOfDoors + " doors.";
    }
}
