import org.app.statistic.StatisticCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticCalculatorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Сравнение средних значений двух списков: среднее значение первого списка больше")
    void compareAverageValues2() {
        List<Integer> listA = List.of(1, 2, 3, 4, 5);
        List<Integer> listB = List.of(1, 2, 3, 4);

        StatisticCalculator.compareAverageValues(listA, listB);
        assertEquals("Первый список имеет большее среднее значение", outContent.toString());
    }

    @Test
    @DisplayName("Сравнение средних значений двух списков: среднее значение второго списка больше")
    void compareAverageValues1() {
        List<Integer> listA = List.of(1, 2, 3);
        List<Integer> listB = List.of(1, 2, 3, 4);

        StatisticCalculator.compareAverageValues(listA, listB);
        assertEquals("Второй список имеет большее среднее значение", outContent.toString());
    }

    @Test
    @DisplayName("Сравнение средних значений двух списков: средние значения равны")
    void compareAverageValues3() {
        List<Integer> listA = List.of(1, 2, 3);
        List<Integer> listB = List.of(1, 2, 3);

        StatisticCalculator.compareAverageValues(listA, listB);
        assertEquals("Средние значения равны", outContent.toString());
    }

    @Test
    @DisplayName("Сравнение средних значений двух списков: есть отрицательные значения, среднее значение первого списка больше")
    void compareAverageValues4() {
        List<Integer> listA = List.of(1, 2, 3);
        List<Integer> listB = List.of(1, 2, -3);

        StatisticCalculator.compareAverageValues(listA, listB);
        assertEquals("Первый список имеет большее среднее значение", outContent.toString());
    }

    @Test
    @DisplayName("Вычисление среднего значения списка")
    void calculateAverageValue1() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        double expected = 3.0;
        double actual = StatisticCalculator.averageList(list);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Вычисление среднего значения списка: список пуст")
    void calculateAverageValue2() {
        List<Integer> list = List.of();
        double expected = Float.NaN;
        double actual = StatisticCalculator.averageList(list);
        assertEquals(expected, actual);
    }
}
