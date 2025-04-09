package org.example.java324.sort.sort3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxHeightBuilding {
    public static void main(String[] args) {
        int[] maximumHeight = {2, 3, 3, 1};
        System.out.println(maximumTotalSum(maximumHeight)); // Output: 22

    }

    public static long maximumTotalSum(int[] maximumHeight) {
        int max = 0;
        for (int i : maximumHeight) {
            if (i > max) {
                max = i;
            }
        }
        if (max < maximumHeight.length) {
            return -1;
        }

        //2 3 3 4
        Arrays.sort(maximumHeight);
        int n = maximumHeight.length;
        int result = 0;


        int lastAssignedHeight = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            int currentHeight = Math.min(maximumHeight[i], lastAssignedHeight - 1);

            if (currentHeight <= 0) {
                return -1;
            }

            result = result + currentHeight;
            lastAssignedHeight = currentHeight;
        }

        return result;
    }
}
