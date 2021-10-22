package ru.netology.stats;

public class StatsService {

    public int calculateMaxSum(int[] months) {
        int currentMax = 0;
        for (int sumMonths : months) {
            currentMax += sumMonths;
        }
        return currentMax;
    }

    public int calculateAvgSum(int[] months) {
        int avgSum = calculateMaxSum(months) / months.length;
        return avgSum;
    }

    public int calculateUpSales(int[] months) {
        int minUpMonth = 0;
        int numUpMonth = 0;
        for (int upSale : months) {
            if (upSale >= months[minUpMonth]) {
                minUpMonth = numUpMonth;
            }
            numUpMonth += 1;
        }
        return minUpMonth + 1;
    }

    public int calculateDownSales(int[] months) {
        int minDownMonth = 0;
        int numDownMonth = 0;
        for (int downSale : months) {
            if (downSale <= months[minDownMonth]) {
                minDownMonth = numDownMonth;
            }
            numDownMonth += 1;
        }
        return minDownMonth + 1;
    }

    public int calculateDownAvgSumSales(int[] months) {
        int avgSum = calculateAvgSum(months);
        int numbersDownMonths = 0;
        for (int numberDownMonths : months) {
            if (numberDownMonths < avgSum) {
                numbersDownMonths += 1;
            }
        }
        return numbersDownMonths;
    }

    public int calculateUpAvgSumSales(int[] months) {
        int avgSum = calculateAvgSum(months);
        int numbersUpMonths = 0;
        for (int numberUpMonths : months) {
            if (numberUpMonths > avgSum) {
                numbersUpMonths += 1;
            }
        }
        return numbersUpMonths;
    }
}