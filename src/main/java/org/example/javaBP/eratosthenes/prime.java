package org.example.javaBP.eratosthenes;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i< n; i++){
            int number = scanner.nextInt();
            if (isPrime(number)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n <=3) {
            return true;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}