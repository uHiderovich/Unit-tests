package org.app.statistic;

import java.util.List;

/**
 * Класс для работы со списками с числами.
 */
public final class StatisticCalculator {
    private StatisticCalculator() { }
    /**
     * Считает среднее значение списка.
     * @param list список для рассчета
     * @return среднее значение
     */
    public static double averageList(final List<Integer> list) {
        double result = 0;

        for (int item : list) {
            result += item;
        }

        return result / list.size();
    }

    /**
     * Сравнивает средние значения двух списков.
     *
     * @param listA
     * @param listB
     */
    public static void compareAverageValues(
        final List<Integer> listA,
        final List<Integer> listB
    ) {
        double averageA = averageList(listA);
        double averageB = averageList(listB);

        if (averageA > averageB) {
            System.out.print("Первый список имеет большее среднее значение");
        } else if (averageA < averageB) {
            System.out.print("Второй список имеет большее среднее значение");
        } else  {
            System.out.print("Средние значения равны");
        }
    }
}
