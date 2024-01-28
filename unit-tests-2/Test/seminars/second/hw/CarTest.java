package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A car")
public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("company", "model", 1990);
    }

    @Test
    @DisplayName("Is instance of the class Vehicle")
    void testInstance() {
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    @DisplayName("Number of wheels")
    void testWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    @DisplayName("Maximum speed in test drive mode")
    void testTestDrive() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    @DisplayName("Stops in parking mode")
    void testParking() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }
}
