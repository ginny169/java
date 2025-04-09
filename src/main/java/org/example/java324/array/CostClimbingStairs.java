package org.example.java324.array;

import java.util.Scanner;

public class CostClimbingStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.println("cach 1: " + minCostClimbingStairs(array));
        System.out.println("cach 2: " + minCostClimbingStairs1(array));
    }

    //hàm tính số bước nhỏ nhất C1.
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 1) return cost[0];

        int mct2 = cost[0];
        int mct1 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int minCostCurrent = cost[i] + Math.min(mct2, mct1);
            mct2 = mct1;
            mct1 = minCostCurrent;
        }
        return Math.min(mct2, mct1);
    }

    public static int minCostClimbingStairs1(int[] cost){
        int n = cost.length;
        int[] result = new int[n];

        result[0] = cost[0];
        result[1] = cost[1];

        for (int i = 2; i< n; i++){
            result[i] = cost[i] + Math.min(result[i-2], result[i-1]);
        }

        return Math.min(result[n-2], result[n-1]);
    }
}

