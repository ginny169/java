package org.example.java324.sort.sort3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiceCheese {
    public static void main(String[] args) {
        int[] reward1 = {1, 2, 3, 5};
        int[] reward2 = {3, 1, 1, 2};

        int k = 2;
        System.out.println(miceAndCheese(reward1, reward2, k));

    }

    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        /*
         */
        int n = reward1.length;
        List<Integer> m1 = new ArrayList<>();
        List<Integer> m2 = new ArrayList<>();

        int[] div = new int[n];
        for (int i = 0; i < n; i++) {
            div[i] = reward1[i] - reward2[i];
        }
//        for (int i: div){
//            System.out.println("div: " + Arrays.toString(div));
//        }

        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (i1, i2) -> (div[i1] - div[i1]));
//        for (int i:index){
//            System.out.println(i);
//        }
        int result = 0;

        for (int i = 0; i < k; i++) {
            int idx = index[i];
            result = result + reward1[idx];
        }

        for (int i = k; i < n; i++) {
            int idx = index[i];
            result = result + reward2[idx];
        }
        return result;
    }
}
