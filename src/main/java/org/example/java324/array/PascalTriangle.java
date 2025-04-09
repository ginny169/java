package org.example.java324.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        int[] array = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            int number = scanner.nextInt();
//            array[i] = number;
//        }
        System.out.println(generate(N));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int value = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(value);
            }
            if (i > 0) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}

