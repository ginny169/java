package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Scanner;

public class countSubParah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            numbersList.add(number);
        }

        for (int i = 0; i < Q; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            System.out.println(count(numbersList,L,R));
        }
    }

    public static int count(ArrayList<Integer> array, int x, int y) {
        int count = 0;
        if (x == y) {
            return array.get(x-1);
        } else {
            for (int i = x-1; i<y; i++){
                count= count+array.get(i);
            }
        }
        return count;
    }
}
