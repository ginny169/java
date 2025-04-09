package org.example.javaBP.onboarding;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 4, 4};
        System.out.println(Arrays.toString(A));
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));
        int step = 0;
        for (int i = 0; i < A.length; i++) {
            step = step + Math.abs(A[i] - (i + 1));
            if (step > 1000000000) {
                return -1;
            }
        }
        return step;
    }
}
