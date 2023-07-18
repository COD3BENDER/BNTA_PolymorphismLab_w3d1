import models.Plane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane planeSuper;
    Plane planeNonSuper;

    @BeforeEach
    public void setUp(){
        planeSuper = new Plane(2,"Military",true);
        planeNonSuper = new Plane(2,"Commercial",false);

    }

    @Test
    public void canTestIsSupersonicTrue(){
        assertThat(planeSuper.isSupersonic()).isEqualTo("The Boeing 747 is supersonic.");
    }
    @Test
    public void canTestIsSupersonicFalse(){
        assertThat(planeNonSuper.isSupersonic()).isEqualTo("The Boeing 747 is not supersonic.");
    }

    @Test
    public void canTestMoveVehicle(){
        assertThat(planeSuper.moveVehicle()).isEqualTo("This vehicle operates on Air");
    }

    @Test
    public void canTestTopSpeed(){
        assertThat(planeNonSuper.topSpeed()).isEqualTo("The Boeing 747 has a top speed of 1110 Km/h.");
    }
}
