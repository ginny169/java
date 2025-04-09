package org.example.java324.sort.sort3;

import java.util.Arrays;

public class HappinessChildren {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 1;
        System.out.println(maximumHappinessSum(arr, k));

    }

    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long happyCount = 0;
        int divide = 0;
        for (int i = happiness.length - 1; i >= 0; i--) {
            happyCount = happyCount + (happiness[i] - divide);
            divide++;
            k--;
            if (k <= 0) {
                break;
            }
            if (happiness[i - 1] - divide <= 0) {
                break;
            }
        }
        return happyCount;
    }
}
