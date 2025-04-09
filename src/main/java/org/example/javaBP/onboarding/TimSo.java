package org.example.javaBP.onboarding;

import java.util.Scanner;

public class TimSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        timSo(a, b, x);

    }

    public static void timSo(int a, int b, int x) {
        boolean flag = false;
        if (a > b||a<1) {
            System.out.println("-1");
        } else {
            for (int i = a; i < b + 1; i++) {
                if (i % x == 0) {
                    System.out.print(i + " ");
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("-1");
            }
        }
    }
}
