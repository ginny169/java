package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Scanner;

public class countSubParahOptimize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int tong = 0;
        int max = tong;

        ArrayList<Integer> maxList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if (tong + number < 0) {
                max = tong;
                tong = 0;
            } else {
                tong = tong + number;
                max = tong;
                maxList.add(max);
            }
        }
        System.out.println(findMax(maxList));
    }

    public static int findMax(ArrayList<Integer> maxList) {
        int max = 0;
        for (Integer integer : maxList) {
            if (integer >= max) {
                max = integer;
            }
        }
        return max;
    }
}


