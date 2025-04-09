package org.example.java324.sort;

import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        int g = 1234;
        int g1 = 65875;
        int g2 = 837126232;
        System.out.println(largestInteger(g2));
        System.out.println(largestInteger(g1));
        System.out.println(largestInteger(g));

    }

    public static int largestInteger(int g) {
        char[] digits = Integer.toString(g).toCharArray();

        List<Character> chan = new ArrayList<>();
        List<Character> le = new ArrayList<>();

        for (char digit : digits) {
            if (digit % 2 == 0) {
                chan.add(digit);
            } else {
                le.add(digit);
            }
        }

        chan.sort(Collections.reverseOrder());
        le.sort(Collections.reverseOrder());

        int chanIndex = 0;
        int leIndex = 0;

        //Sắp xếp lại thứ tự số
        for (int i = 0; i < digits.length; i++) {
            if ((digits[i] - '0') % 2 == 0){
                digits[i] = chan.get(chanIndex);
                chanIndex++;
            } else {
                digits[i] = le.get(leIndex++);
            }
        }

        return Integer.parseInt(new String(digits));
    }
}
