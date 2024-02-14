package org.app.statistic;

import java.util.List;

/**
 * Класс для работы со списками с числами.
 */
public class StatisticCalculator {
    /**
     * Считает среднее значение списка.
     * @param list список для рассчета
     * @return среднее значение
     */
    public static int averageList(final List<Integer> list) {
        int result = 0;
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

        int averageA = averageList(listA);
        int averageB = averageList(listB);

        if (averageA > averageB) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (averageA < averageB) {
            System.out.println("Второй список имеет большее среднее значение");
        } else  {
            System.out.println("Средние значения равны");
        }
    }
}
