package org.example.javaBP.array;

import java.util.Scanner;

public class LongestTriangleSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử
        int n = scanner.nextInt();
        int[] arr = new int[n+1];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Trường hợp n = 1
        if (n == 1) {
            System.out.println(1);
        }

        // Mảng lưu độ dài phần tăng và giảm
        int[] increase = new int[n];
        int[] decrease = new int[n];

        // Tính mảng increase
        increase[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                increase[i] = increase[i - 1] + 1;
            } else {
                increase[i] = 1;
            }
        }

        // Tính mảng decrease
        decrease[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                decrease[i] = decrease[i + 1] + 1;
            } else {
                decrease[i] = 0;
            }
        }

        //lấy maxIncrease và maxDecrease để nếu 1 trong 2 bằng 0 --> không có triangleSequense
        int maxIncrease = maxValueofArray(increase);
        int maxDecrease = maxValueofArray(decrease);

        int maxLength = 0;
        if (maxDecrease == 0 || maxIncrease == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < n; i++) {
                int length = increase[i] + decrease[i];
                maxLength = Math.max(maxLength, length); //nếu maxLength tại i tắng, ghi lại vào maxLength
            }
            System.out.println(maxLength);
        }
    }

    private static int maxValueofArray(int[] array) {
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}