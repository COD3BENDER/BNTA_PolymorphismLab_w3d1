import models.Boat;
import models.Car;
import models.Plane;
import models.Storage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StorageTest {
    Storage storage;
    Car car;
    Plane plane;
    Boat boat;

    @BeforeEach
    public void setUp(){
        storage = new Storage();
        car = new Car(5,false,"Audi");
        plane = new Plane(2,"Commercial",false);
        boat = new Boat(true, true);

        storage.addVehicle(car);
        storage.addVehicle(plane);
        storage.addVehicle(boat);

    }

    @Test
    public void canTestAddVehicle(){
        Car vw = new Car(5,false,"Golf");
        storage.addVehicle(vw);
        assertThat(storage.getVehicles().size()).isEqualTo(4);

    }

    @Test
    public void canTestRemoveVehicle(){
        storage.removeVehicle(plane);
        assertThat(storage.getVehicles().size()).isEqualTo(2);
    }

    @Test
    public void canTestCalculateRent(){
        storage.calculateRent(); // total is 500 and * 0.1 = 50
        assertThat(storage.getTotalRent()).isEqualTo(50);
    }
}
