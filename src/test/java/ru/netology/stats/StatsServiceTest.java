package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {


    //месяц максимальных продаж
    @Test
    public void maxMonthSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxMonthSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    //месяц минимальных продаж
    @Test
    public void minMonthSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minMonthSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    //сумма всех продаж
    @Test
    public void amountSalesTest(){
        StatsService service = new StatsService();
        long[] sales ={ 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.amountSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    //средняя сумма продаж
    @Test
    public void averageSalesTest(){
        StatsService service = new StatsService();
        long[] sales ={ 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.averageSales(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    //кол-во месяцев,где продажи ниже среднего
    @Test
    public void monthsSalesBelowAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthsSalesBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    //кол-во месяцев,где продажи выше среднего
    @Test
    public void monthsSalesAboveAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthsSalesAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}