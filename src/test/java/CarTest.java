import models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car carConv;
    Car carNonConv;

    @BeforeEach
    public void setUp(){
        carConv = new Car(3,true,"BMW");
        carNonConv = new Car(5,false,"BMW");
    }

    @Test
    public void canTestIsItConvertibleTrue(){
        assertThat(carConv.isItConvertible()).isEqualTo("The BMW M3 has a convertible roof.");
    }
    @Test
    public void canTestIsItConvertibleFalse(){
        assertThat(carNonConv.isItConvertible()).isEqualTo("The BMW M3 does not have a convertible roof.");
    }

    @Test
    public void canTestMoveVehicle(){
        assertThat(carConv.moveVehicle()).isEqualTo("This vehicle operates on Land with 3 doors.");
    }

    @Test
    public void canTestTopSpeed(){
        assertThat(carNonConv.topSpeed()).isEqualTo("The BMW M3 has a top speed of 210 mph.");
    }

}
