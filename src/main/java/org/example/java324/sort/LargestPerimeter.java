package org.example.java324.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestPerimeter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(largestPerimeter(arr));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.println(i);
        }

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] <= (nums[i - 1] + nums[i - 2])) {
                return (nums[i] + nums[i - 1] + nums[i - 2]);
            }
        }
        return 0;
    }
}
