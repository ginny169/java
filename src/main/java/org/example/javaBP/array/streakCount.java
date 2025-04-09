package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Scanner;

public class streakCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            array.add(number);
        }
        System.out.println(streakCount(array));
    }

    public static int streakCount(ArrayList<Integer> array) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) < array.get(i + 1)) {
                count = count + 1;
                if (count>max){
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
