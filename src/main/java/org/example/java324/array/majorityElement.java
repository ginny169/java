package org.example.java324.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }

        System.out.println(findMajorityElement1(array));
    }

    public static int findMajorityElement(int[] nums) {
        int avg = nums.length / 2;
        Arrays.sort(nums);
        return nums[avg];
    }

    public static int findMajorityElement1(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            if (result.containsKey(nums[i])){
                result.put(nums[i], result.get(nums[i])+1);
            } else result.put(nums[i],1);
        }

        int max = 0;
        int keyA = 0;
        for (Integer key: result.keySet()){
            if (max < result.get(key)){
                max = result.get(key);
                keyA = key;
            }
            max = Math.max(result.get(key),max);
        }
        return keyA;
    }
}

