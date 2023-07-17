public class Boat extends Vehicle{

    boolean hasSail;
    boolean hasEngine;

    public Boat(boolean hasSail, boolean hasEngine){
        super(0,0,"","Sea",false,25000);
        this.hasSail = hasSail;
        this.hasEngine = hasEngine;

    }

    @Override
    public String moveVehicle() {
        return super.moveVehicle() + this.travelType;
    }
}
