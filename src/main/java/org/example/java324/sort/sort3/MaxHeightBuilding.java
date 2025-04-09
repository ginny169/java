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
//        int max = 0;
//        for (int i : maximumHeight) {
//            if (i > max) {
//                max = i;
//            }
//        }
//        if (max < maximumHeight.length) {
//            return -1;
//        }

        //2 3 3 4
        /*
        - max --> max < size ==> return -1;
        - 2334 --> 4 3 3-1 2
         */
        Arrays.sort(maximumHeight);
        int n = maximumHeight.length;
        int result = maximumHeight[n-1];
        int current = maximumHeight[n-1];
        for (int i = n-2; i>=0; i--){
            if (maximumHeight[i]>=current){
                result = result + current-1;
                current = current -1;
                if (current<=0){
                    return -1;
                }
            } else {
                result = result + maximumHeight[i];
                current = maximumHeight[i];
            }
        }
//        int lastAssignedHeight = Integer.MAX_VALUE;
//        for (int i = n - 1; i >= 0; i--) {
//            int currentHeight = Math.min(maximumHeight[i], lastAssignedHeight - 1);
//
//            if (currentHeight <= 0) {
//                return -1;
//            }
//
//            result = result + currentHeight;
//            lastAssignedHeight = currentHeight;
//        }
//
        return result;
    }
}
