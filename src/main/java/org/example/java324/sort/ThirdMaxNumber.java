package org.example.java324.sort;

import java.util.*;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }

        list.sort(Collections.reverseOrder());

        //dùng set để lọc các phần từ trùng (nếu k trùng mới đc add).
        Set<Integer> result = new HashSet<>(list);
        List<Integer> result2 = new ArrayList<>(result);

        if (result2.size() >= 3) {
            return result2.get(2);
        } else {
            return result2.get(0);
        }
    }
}
