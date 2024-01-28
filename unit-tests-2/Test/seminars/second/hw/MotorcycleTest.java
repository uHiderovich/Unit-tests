package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A motorcycle")
public class MotorcycleTest {
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("company", "model", 1990);
    }

    @Test
    @DisplayName("Is instance of the class Vehicle")
    void testInstance() {
        assertInstanceOf(Vehicle.class, motorcycle);
    }

    @Test
    @DisplayName("Number of wheels")
    void testWheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    @DisplayName("Maximum speed in test drive mode")
    void testTestDrive() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    @DisplayName("Stops in parking mode")
    void testParking() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}
