package org.example.javaBP.string;

import java.util.Objects;
import java.util.Scanner;

public class swaps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solution(S));

    }

    public static int solution(String S) {

        int step = 0;

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'b') {
                countB = countB + 1;
                step = countA / 3 + step + countB / 3;
                countA = 0;
            } else {
                countA = countA + 1;
                step = step + countB / 3 + countA / 3;
                countB = 0;
            }
        }

        return step;
    }
}

