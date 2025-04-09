package org.example.javaBP.eratosthenes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SieveOfEratosthenes {
    private static List<Integer> sieveOfEratosthenes(int MAX) {
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 và 1 không phải số nguyên tố

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Lưu tất cả các số nguyên tố vào danh sách
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        int MAX = 1299709; // Đủ lớn để chứa 10^5 số nguyên tố
        List<Integer> primes = sieveOfEratosthenes(MAX);

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int index = scanner.nextInt();
            System.out.println(primes.get(index-1));
        }
        scanner.close();
    }
}
