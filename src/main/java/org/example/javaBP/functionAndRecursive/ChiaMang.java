package org.example.javaBP.functionAndRecursive;

import java.util.Arrays;
import java.util.Scanner;

public class ChiaMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        if (chiaMangchoK(array, K)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //    public static boolean
    public static boolean chiaMangchoK(int[] array, int K) {
        int sum = Arrays.stream(array).sum();

        if (sum % K != 0) return false;
        int targetSum = sum / K;

        if (array.length < K) return false;

        Arrays.sort(array);
        int n = array.length;
        if (array[n - 1] > targetSum) return false;

        boolean[] used = new boolean[n];
        return backTrack(array, used, K, targetSum, 0, 0);

    }

    public static boolean backTrack(int[] array, boolean[] used, int k, int targetSum, int currentSum, int startIndex) {
        if (k == 0) return true;
        if (currentSum == targetSum) {
            return backTrack(array, used, k - 1, targetSum, 0, 0);
        }

        for (int i = startIndex; i < array.length; i++) {
            if (!used[i] && currentSum + array[i] <= targetSum) {
                used[i] = true;
                if (backTrack(array, used, k, targetSum, currentSum+array[i], i + 1)) {
                    return true;
                }
                used[i] = false;
//                System.out.println(array[i]);
            }
        }
//        System.out.println(Arrays.toString(used));
        return false;
    }

}
