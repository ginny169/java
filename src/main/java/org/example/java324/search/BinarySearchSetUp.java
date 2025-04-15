package org.example.java324.search;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearchSetUp {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        int k = 1;
//        System.out.println(binarySearch(arr, k));
        System.out.println(findLowerBound(arr,11));
        System.out.println(findUpperBound(arr,11));


    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //Lowerbound --> Tìm chỉ số đầu tiên trong mảng đã sắp xếp mà phần tử tại đó ≥ target.
    public static int findLowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int ans = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return ans;
    }

    //Lowerbound --> Tìm chỉ số đầu tiên trong mảng đã sắp xếp mà phần tử tại đó > target.
    public static int findUpperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int ans = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                ans = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return ans;
    }
}
