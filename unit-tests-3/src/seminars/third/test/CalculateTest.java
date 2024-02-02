import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.Calculate;

@DisplayName("Testing calculate")
public class CalculateTest {
    @Nested
    @DisplayName("Testing evenOddNumber method")
    class EvenOddNumberTest {
        @ParameterizedTest
        @ValueSource(ints = {2, 4, 6, 8, 10, 12})
        @DisplayName("testing even numbers")
        public void testEvenNumber(int number) {
            assertTrue(Calculate.evenOddNumber(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9, 11})
        @DisplayName("testing odd numbers")
        public void testOddNumber(int number) {
            assertFalse(Calculate.evenOddNumber(number));
        }

        @Test
        @DisplayName("testing zero")
        public void testZero() {
            assertTrue(Calculate.evenOddNumber(0));
        }

        @ParameterizedTest
        @ValueSource(ints = {-2, -4, -6, -8, -10, -12})
        @DisplayName("testing negative even numbers")
        public void testNegativeNumber(int number) {
            assertTrue(Calculate.evenOddNumber(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9, 11})
        @DisplayName("testing negative odd numbers")
        public void testNegativeOddNumber(int number) {
            assertFalse(Calculate.evenOddNumber(number));
        }
    }

    @Nested
    @DisplayName("Testing numberInInterval method")
    class NumberInInterval {
        @ParameterizedTest
        @ValueSource(ints = {2, 4, 6, 8, 10, 12})
        @DisplayName("Testing even numbers in interval")
        public void testNumberInIntervalEven(int number) {
            assertTrue(Calculate.numberInInterval(number, 2, 12));
        }

        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9, 11})
        @DisplayName("Testing odd numbers in interval")
        public void testNumberInIntervalOdd(int number) {
            assertFalse(Calculate.numberInInterval(number, 2, 12));
        }

        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9, 11})
        @DisplayName("Testing negative odd numbers in interval")
        public void testNumberInIntervalNegativeOdd(int number) {
            assertFalse(Calculate.numberInInterval(number, -2, -1));
        }

        @ParameterizedTest
        @ValueSource(ints = {-2, -4, -6, -8, -10, -12})
        @DisplayName("Testing negative even numbers in interval")
        public void testNumberInIntervalNegativeEven(int number) {
            assertTrue(Calculate.numberInInterval(number, -2, -1));
        }

        @Test
        @DisplayName("Testing zero in interval")
        public void testNumberInIntervalZero() {
            assertTrue(Calculate.numberInInterval(0, -2, 12));
        }
    }
}
