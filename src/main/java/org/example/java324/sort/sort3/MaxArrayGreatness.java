package org.example.java324.sort.sort3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxArrayGreatness {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 1, 3, 1};

        System.out.println(maximizeGreatness(nums));

    }
    public static int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        int result = 0;

        while (j< nums.length){
            if (nums[j]> nums[i]){
                result ++;
                i++;
            }
            j++;
        }
        return result;
    }
}
