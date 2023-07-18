import models.Car;
import models.Garage;
import models.Storage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Storage storage;
    Garage garage;
    Car car;

    @BeforeEach
    public void setUp(){
        storage = new Storage();
        garage = new Garage(500);
        car = new Car(4,false,"BMW");
        storage.addVehicle(car);
    }

    @Test
    public void canTestAddVehicleFromStorage(){
        garage.addFixVehicles(storage, "BMW M3");
        assertThat(garage.getFixVehicles().size()).isEqualTo(1);
    }

    @Test
    public void canTestTotalCost(){
        garage.addFixVehicles(storage, "BMW M3");
        assertThat(garage.totalCost()).isEqualTo(505);
    }
}
