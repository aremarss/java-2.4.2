package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateMaxSum() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateMaxSum(months);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvgSum() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAvgSum(months);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUpSales() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateUpSales(months);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateDownSales() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calculateDownSales(months);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateDownAvgSumSales() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateDownAvgSumSales(months);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUpAvgSumSales() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateUpAvgSumSales(months);

        assertEquals(expected, actual);
    }
}