package org.example.java324.search;

public class PeakIndexOfMountain {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));

    }

    public static int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<=arr[i-1]){
                return i-1;
            }
        }
        return arr.length-1;
    }
}
