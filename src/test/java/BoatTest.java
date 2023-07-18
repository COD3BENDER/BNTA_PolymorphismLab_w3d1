import models.Boat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoatTest {

    Boat boatRowing;
    Boat boatEngineSail;
    Boat boatEngine;
    Boat boatSail;

    @BeforeEach
    public void setUp(){
        boatRowing = new Boat(false,false);
        boatEngineSail = new Boat(true,true);
        boatEngine = new Boat(false,true);
        boatSail = new Boat(true,false);
    }

    @Test
    public void testPropulsionTypeTrueBoth(){
        assertThat(boatEngineSail.propulsionType()).isEqualTo("The Atlantis has both an Engine and a Sail.");
    }

    @Test
    public void testPropulsionTypeTrueEngine(){
        assertThat(boatEngine.propulsionType()).isEqualTo("The Atlantis has an Engine.");
    }

    @Test
    public void testPropulsionTypeTrueSail(){
        assertThat(boatSail.propulsionType()).isEqualTo("The Atlantis has a Sail.");
    }

    @Test
    public void testPropulsionTypeFalse(){
        assertThat(boatRowing.propulsionType()).isEqualTo("The Atlantis has no Sail or Engine.");
    }

    @Test
    public void testMoveVehicle(){
        assertThat(boatEngine.moveVehicle()).isEqualTo("This vehicle operates on Water");
    }

    @Test
    public void testTopVehicle(){
        assertThat(boatEngine.topSpeed()).isEqualTo("The Atlantis has a top speed of 250 mph.");
    }
}
