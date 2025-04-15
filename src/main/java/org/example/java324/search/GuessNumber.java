package org.example.java324.search;

public class GuessNumber {
    public static void main(String[] args) {
        int n = 2126753390;
        System.out.println("Guessed number: " + guessNumber(n));

    }

    static int pick = 1;

    public static int guess(int guessNum) {
        if (pick == guessNum){
            return 0;
        } else if (pick > guessNum){
            return 1;
        } else {
            return -1;
        }
    }

    public static int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = (left + right) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}