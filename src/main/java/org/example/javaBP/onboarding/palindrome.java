package org.example.javaBP.onboarding;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(isPalindrome(N));
    }

    public static boolean isPalindrome(int x) {
        String stringX = Integer.toString(x);
        String reverse = "";
        char ch;
        for (int i = 0; i < stringX.length(); i++) {
            ch = stringX.charAt(i);
            reverse = ch + reverse;
        }
        return (stringX.equals(reverse));
    }
}

