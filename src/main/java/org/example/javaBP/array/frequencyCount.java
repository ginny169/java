package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class frequencyCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int number = scanner.nextInt();
            numberList.add(number);
        }

        for (Integer integer : distinct(numberList)) {
            System.out.println(integer+" "+appearCount(numberList,integer));
        }

    }

    //count số lần xuất hiện
    public static int appearCount(ArrayList<Integer> array, int x) {
        int appearCount = 0;
        for (Integer integer : array) {
            if (integer == x) {
                appearCount++;
            }
        }
        return appearCount;
    }

    //lọc các số trùng và sắp xếp mảng.
    public static ArrayList<Integer> distinct(ArrayList<Integer> array) {
        ArrayList<Integer> distinctList = new ArrayList<>();
        for (Integer a : array) {
                if (!distinctList.contains(a)) {
                    distinctList.add(a);
                }
            }
        Collections.sort(distinctList);
        return distinctList;
    }
}

