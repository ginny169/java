package org.example.java324.array;

import java.util.Scanner;

public class tradeStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min;
        for (int i = 0; i < prices.length; i++) {
            for (int k = i + 1; k < prices.length; k++) {
                min = prices[k] - prices[i];
                if (min > max) {
                    max = min;
                }
            }
        }
        return max;
    }

    public static int maxProfit1(int[] prices) {
        int profit = 0;
        int minOriginalPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minOriginalPrice = Math.min(prices[i], minOriginalPrice);
            profit = Math.max(prices[i] - minOriginalPrice, profit);
        }
        return profit;
    }

}

