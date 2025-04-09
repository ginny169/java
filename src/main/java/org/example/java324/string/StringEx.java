package org.example.java324.string;

import java.util.ArrayList;
import java.util.List;

public class StringEx {

    public static void main(String[] args) {
        java.lang.String S = "hello";
//        System.out.println(scoreOfString(S));
//        String a = "zZ";
//        String b = "ZZ";
//        System.out.println(countJewel(a, b));
        String date = "2080-02-29";
        System.out.println(changStoB(date));


    }

    public static int scoreOfString(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            count = count + Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return count;
    }

    public static int countJewel(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int k = 0; k < b.length(); k++) {
                if (b.charAt(k) == a.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String changeNtoB(int N) {
        String binary = "";
        int soDu = N;
        int nguyen;
        while (soDu != 0) {
            nguyen = soDu % 2;
            binary = nguyen + binary;
            soDu = soDu / 2;
        }
        return binary;
    }

    //return ngày dạng số tự nhiên sang số nhị phân.
    public static String changStoB(java.lang.String s) {
        String result = "";
        String[] parts = s.split("-");
        for (java.lang.String i : parts) {
            result = result + "-" + Integer.toBinaryString(Integer.parseInt(i));
        }
        return result.substring(1);
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i< words.length; i++){
            if (words[i].contains(""+x)){
                result.add(i);
            }
        }
        return result;
    }
}

