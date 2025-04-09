package org.example.java324.sort;

import java.io.FilterOutputStream;
import java.util.*;

public class FindKCloestElements {
    public static void main(String[] args) {
        int[] arr = {1,1, 2, 3, 4, 5};
        int k = 4;
        int x = -1;
        System.out.println(findClosestElements(arr,k,x));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        /*
        Dùng con trỏ
         */

        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while (right - left >= k) {
            if (Math.abs(arr[left] - x) < Math.abs(arr[right] - x)) {
                right--;
            } else {
                left++;
            }
        }

        for (int i = left; i < right + 1; i++) {
            result.add(arr[i]);
        }

        Collections.sort(result);
        return result;
    }
}
