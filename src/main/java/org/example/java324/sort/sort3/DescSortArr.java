package org.example.java324.sort.sort3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DescSortArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        //cach 1
        int[] arrDesc = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        for (int j : arrDesc) {
            System.out.println(j);
        }

        //cach 2:
        Arrays.sort(arr);

        int[][] array= {
                {1, 5},
                {13, 1},
                {12, 100},
                {12, 85}
        };
        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1])); // for ascending order
        Arrays.sort(array, (b, a) -> Integer.compare(a[1], b[1])); // for descending order

    }
}
