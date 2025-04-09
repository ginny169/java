package org.example.javaBP.functionAndRecursive;

import java.util.*;

public class themday68C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        Queue<Long> queue = new LinkedList<>();

        queue.add(6L);
        queue.add(8L);

        while (!queue.isEmpty()) {
            long current = queue.poll();

            if (current <= n) {
                System.out.println(current);

                queue.add(current * 10 + 6);
                queue.add(current * 10 + 8);
            }
        }
    }
}