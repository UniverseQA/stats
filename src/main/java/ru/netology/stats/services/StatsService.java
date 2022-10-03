package ru.netology.stats.services;

public class StatsService {

    public int getTotalAmountSales(int[] sales) {
        int totalAmountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalAmountSales += sales[i];
        }
        return totalAmountSales;
    }

    public int getAverageAmountSales(int[] sales) {
        int totalAmountSales = getTotalAmountSales(sales);
        int averageAmountSales = totalAmountSales / sales.length;
        return averageAmountSales;
    }

//public int getAverageAmountSales2(int [] sales) {
//        int averageAmountSales2 = 0;
//        for (int i = 0; i < sales.length; i++) {
//            averageAmountSales2 +=sales[i];
//                    }
//    return averageAmountSales2;
//}

    public int getMonthMaxAmountSales(int[] sales) {
        int monthMaxAmountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaxAmountSales] <= sales[i]) {
                monthMaxAmountSales = i;
            }
        }
        return monthMaxAmountSales + 1;
    }

    public int getMonthMinAmountSales(int[] sales) {
        int monthMinAmountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMinAmountSales] >= sales[i]) {
                monthMinAmountSales = i;
            }
        }
        return monthMinAmountSales + 1;
    }

    public int getAmountMonthsSalesBelowAverage(int[] sales) {
        int amountMonthsSalesBelowAverage = 0;
        int averageAmountSales = getAverageAmountSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmountSales) {
                amountMonthsSalesBelowAverage++;
            }
        }
        return amountMonthsSalesBelowAverage;
    }

    public int getAmountMonthsSalesAboveAverage(int[] sales) {
        int amountMonthsSalesAboveAverage = 0;
        int averageAmountSales = getAverageAmountSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmountSales) {
                amountMonthsSalesAboveAverage++;
            }
        }
        return amountMonthsSalesAboveAverage;
    }

//    public int getAmountMonthsSalesAboveAverage2(int[] sales) {
//        int amountMonthsSalesAboveAverage = 0;
//        int averageAmountSales = getAverageAmountSales(sales);
//        for (int a : sales) {
//            if (a > averageAmountSales) {
//                amountMonthsSalesAboveAverage++;
//            }
//        }
//        return amountMonthsSalesAboveAverage;
//    }
}
