package org.example.java324.search;

public class GuessNumber {
    public static void main(String[] args) {
        int n = 2126753390;
        int picked = 1702766719;
        Solution solution = new Solution(picked);
        System.out.println("Guessed number: " + solution.guessNumber(n));

    }

    public static class GuessGame {
        private static int pickedNumber;

        public GuessGame(int pickedNumber) {
            this.pickedNumber = pickedNumber;
        }

        //api
        public static int guess(int num) {
            if (num > pickedNumber) {
                return -1;
            } else if (num < pickedNumber) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static class Solution extends GuessGame {
        public Solution(int pickedNumber) {
            super(pickedNumber);
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

}
