package org.example.javaBP.array;

import java.util.Arrays;
import java.util.Scanner;

public class arrangeChessOptimize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] myIntArray = new int[N];
        for (int i = 0; i < N; i++) {
            myIntArray[i]= scanner.nextInt();
        }
        int max = maxValueofArray(myIntArray);
        System.out.println(Arrays.toString(preProcessArray(myIntArray, max)));

    }

    private static int[] preProcessArray(int[] array, int max) {
        int[] preArray = new int[max + 1];
        for (int i = 0; i < max; i++) {
            preArray[array[i]]++;
        }
        return preArray;
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

