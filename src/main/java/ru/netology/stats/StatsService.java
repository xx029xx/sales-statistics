package ru.netology.stats;

public class StatsService {

    //номер месяца минимальных продаж
    public int minMonthSales(long[] sales) {
        int minMonth =0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }
        return minMonth + 1;
    }

    //номер месяца максимальных продаж
    public int maxMonthSales(long[] sales) {
        int maxMonth =0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }
        }
        return maxMonth + 1;
    }

    //сумма всех продаж
    public long amountSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    //средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        return amountSales(sales) / sales.length;
    }

    //кол-во месяцев,где продажи ниже среднего
    public int monthsSalesBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                counter++;
            }

        }
        return counter;
    }

    //кол-во месяцев,где продажи вышее среднего
    public int monthsSalesAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                counter++;
            }

        }
        return counter;
    }
}
