package org.example.java324.array;

import java.util.Scanner;

public class plusOneToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        int[] result = plusOne(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int b = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digits[i]++;
            }
            digits[i] = digits[i] + 1;
            if (digits[i] > 9) {
                digits[i] = digits[i] - 10;
                b = 1;
            } else return digits;
        }
        if (b==1){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i = 1; i< digits.length;i++){
                result[i] = 0;
            }
            return result;
        }
        return digits;
    }
}

