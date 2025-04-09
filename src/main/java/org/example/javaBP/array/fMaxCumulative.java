package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Scanner;

public class fMaxCumulative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            array.add(number);
        }

        ArrayList<Integer> maxCul = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            maxCul.addAll(buildCumlative(array));
            array.remove(0);
        }

        System.out.println(findMax(maxCul));
    }
    public static ArrayList<Integer> buildCumlative(ArrayList<Integer> array) {
        ArrayList<Integer> mang = new ArrayList<>();
        mang.add(array.get(0));
        for (int i = 1; i < array.size(); i++) {
            mang.add(mang.get(i - 1) + array.get(i));
        }
        return mang;
    }
    public static int findMax(ArrayList<Integer> array) {
        int max = 0;
        for (Integer integer : array) {
            if (integer >= max) {
                max = integer;
            }
        }
        return max;
    }
}
