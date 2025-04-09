package org.example.javaBP.eratosthenes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class soGanSoNguyenTo {
    private static List<Long> sieveOfEratosthenes(int MAX) {
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
        List<Long> nearPrimes = new ArrayList<>();
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                long square = (long) i*i;
                nearPrimes.add(square);
            }
        }
        return nearPrimes;
    }

    public static void main(String[] args) {

        List<Long> nearPrimes = sieveOfEratosthenes(10000000);

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long count = 0;
        for (int i = 0; i < N; i++) {
            long number = scanner.nextInt();
            if (nearPrimes.contains(number)){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
