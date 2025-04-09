package org.example.javaBP.onboarding;

import java.util.Scanner;

public class ChinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long k = (int)Math.ceil(Math.sqrt(a));
        long m = (int)Math.sqrt(b);

        StringBuilder list = new StringBuilder();
        for (int i= (int)k; i<= m ;i++){
            list.append((long)Math.pow(i,2)).append(" ");
        }
        System.out.println(list.toString().trim());
    }
}
