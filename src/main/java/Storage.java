import java.util.ArrayList;

public class Storage {
    private ArrayList<Vehicle> vehicles;
    private int totalRent;

    public Storage(){
        vehicles = new ArrayList<>();
        this.totalRent = 0;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove((vehicle));
    }

    public void calculateRent(){
        for (int i = 0; i < vehicles.size(); i++) {
            totalRent+=(vehicles.get(i).getPrice() * 0.1); // rent is 10% of vehicle cost for example.
        }
    }
}
