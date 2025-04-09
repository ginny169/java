package org.example.javaBP.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arrangeCar {

    public static void main(String[] args) {
        int[] P = {2, 3, 4, 2};
        int[] S = {2, 5, 7, 2};
        System.out.println(solution(P, S));

    }

    public static int solution(int[] P, int[] S) {
        Arrays.sort(S);
        int totalP = 0;
        int minCars = 0;
        for (int i : P) {
                totalP = totalP + i;
        }
        int remain = totalP;
        for (int k = S.length - 1; k >= 0; k--) {
           remain = remain - S[k];
            if (remain > 0) {
                minCars = minCars + 1;
            } else {
                minCars = minCars + 1;
                break;
            }
        }
        return minCars;
    }
}

