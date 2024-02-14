

import org.app.statistic.StatisticCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticCalculatorTest {
    @Test
    @DisplayName("Сравнение средних значений двух списков")
    void compareAverageValues() {
        List<Integer> listA = List.of(1, 2, 3);
        List<Integer> listB = List.of(1, 2, 3, 4);

        StatisticCalculator.compareAverageValues(listA, listB);

    }
}
