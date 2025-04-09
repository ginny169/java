package org.example.javaBP.onboarding;

import java.util.Scanner;

public class ChinhPhuong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        timChinhPhuong(a, b);

    }

    public static void timChinhPhuong(long a, long b) {

        for (long i= (long)Math.sqrt(a); i<= (long)Math.sqrt(b)  ;i++){
            if (i*i>=a){
                System.out.print(i*i+ " ");
            }
        }
    }
}
