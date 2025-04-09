package org.example.javaBP.onboarding;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 4, 4};
        System.out.println(Arrays.toString(A));
        System.out.println(solution("BA"));
    }

    public static int solution(String S) {
        if (!S.contains("BA")) {
            return 0;
        }
        /*ý tưởng
        1. Nếu gặp BA --> xoá B.
        2. Duyệt lại chuỗi đến khi không còn BA nữa
        */
//        for (int i = 0; i < S.length(); i++) {
//            if{
//                return 1;
//            }
//        }
        return 2;
    }
}
