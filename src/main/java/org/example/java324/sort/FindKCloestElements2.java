package org.example.java324.sort;

import java.util.*;

public class FindKCloestElements2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        int k = 4;
        int x = 7;
        System.out.println(findClosestElements(arr, k, x));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        /*
        Dùng sort
         */

        List<Integer> result = new ArrayList<>();
        for (int i : arr) {
            result.add(i);
        }
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1 - x) < Math.abs(o2 - x)) {
                    return -1;
                } else if (Math.abs(o1 - x) == Math.abs(o2 - x)) {
                    if (o1 < o2) {
                        return -1;
                    } else return 1;
                }
                else return  1;
            }
        });

        List<Integer> result2 = new ArrayList<>();
        result2 = result.subList(0,k);
        Collections.sort(result2);

        return result2;
    }
}
