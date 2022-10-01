package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test

    public void shouldCalcTotalAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedTotalAmountSales = 180;
        int actualTotalAmountSales = service.getTotalAmountSales(sales);

        Assertions.assertEquals(expectedTotalAmountSales, actualTotalAmountSales);

    }

    @Test

    public void shouldCalcAverageAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageAmountSales = 15;
        int actualAverageAmountSales = service.getAverageAmountSales(sales);

        Assertions.assertEquals(expectedAverageAmountSales, actualAverageAmountSales);

    }

//    @Test
//
//    public void shouldCalcAverageAmountSales2() {
//        StatsService service = new StatsService();
//
//        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 70};
//
//        int expectedAverageAmount = 19;
//        int actualAverageAmount = service.getAverageAmountSales2(sales);
//
//        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
//
//    }

    @Test

    public void shouldFindMonthMaxAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMaxAmountSales = 8;
        int actualMonthMaxAmountSales = service.getMonthMaxAmountSales(sales);

        Assertions.assertEquals(expectedMonthMaxAmountSales, actualMonthMaxAmountSales);

    }

    @Test

    public void shouldFindMonthMinAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMinAmount = 9;
        int actualMonthMaxAmount = service.getMonthMinAmountSales(sales);

        Assertions.assertEquals(expectedMonthMinAmount, actualMonthMaxAmount);

    }

    @Test

    public void shoulCalcAmountMonthsSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountMonthsSalesBelowAverage = 5;
        int actualAmountMonthsSalesBelowAverage = service.getAmountMonthsSalesBelowAverage(sales);

        Assertions.assertEquals(expectedAmountMonthsSalesBelowAverage, actualAmountMonthsSalesBelowAverage);

    }

    @Test

    public void shouldCalcAmountMonthsSalesAboveAverage() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountMonthsSalesAboveAverage = 5;
        int actualAmountMonthSalesAboveAverage = service.getAmountMonthsSalesAboveAverage(sales);

        Assertions.assertEquals(expectedAmountMonthsSalesAboveAverage, actualAmountMonthSalesAboveAverage);

    }
}
