package org.example.javaBP.functionAndRecursive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class themday68 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        luckyList(n, "");

    }

    public static void luckyList(long n, String current) {
        ArrayList<Long> numbers = new ArrayList<>();
        if (!Objects.equals(current, "")) {
            long number = Long.parseLong(current);  // Chuyển chuỗi thành Integer
            if (number > n) {
                return;
            } else numbers.add(number);
        }

        luckyList(n, current + "6");
        luckyList(n, current + "8");
    }

}