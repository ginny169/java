package org.example.java324.search;

public class SqrtI {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(mySqrt(n));

    }

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int result = 0;
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long s = (long) mid * mid;
            if (s >= x) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (result*result==x){
            return result;
        } else {
            return result-1;
        }
    }

}
