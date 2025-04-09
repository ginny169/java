package org.example.javaBP.functionAndRecursive;

import java.util.HashMap;
import java.util.Scanner;

public class fibonaci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        if (n < 1 || n > 80) {
            n = scanner.nextByte();
        }
        System.out.println(findFibonaci(n));
    }

    private static HashMap<Integer, Long> memo = new HashMap<>();


    //ham check so so chan
    public static long findFibonaci(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
//            System.out.println(memo.get(n));
            return memo.get(n);
        }
        long result = findFibonaci(n - 1) + findFibonaci(n - 2);
        memo.put(n, result);

        return result;

    }
}
