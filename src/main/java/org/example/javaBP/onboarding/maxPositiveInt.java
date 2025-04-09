package org.example.javaBP.onboarding;

import java.util.Arrays;
import java.util.Scanner;

public class maxPositiveInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] soNguyen = new int[N];
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            soNguyen[i] = x;
        }
        System.out.println(maxPositive(soNguyen));
    }

    public static int maxPositive(int[] N) {
        Arrays.sort(N);
        int min = 1;

        for (int i=0; i< N.length; i++){
            if (N[i] == min){
                min++;
            } else if (N[i] < min) {
            }else {
                return min;
            }
        }
        return min;
    }
}
