public class Plane extends Vehicle{

    private int noOfWings;

    private String serviceType;
    private boolean supersonic;

    public Plane(int noOfWings, String serviceType, boolean supersonic){
        super(2,0,"","Air",false, 200000);
        this.noOfWings = noOfWings;
        this.serviceType = serviceType;
        this.supersonic = supersonic;


    }

    @Override
    public String moveVehicle() {
        return super.moveVehicle() + this.travelType;
    }
}
