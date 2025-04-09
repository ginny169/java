package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Scanner;

public class checkInArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int number = scanner.nextInt();
            array.add(number);
        }


        for (int j = 0; j < N; j++) {
            System.out.print((j+1) +": " );
            for (int x=0; x<array.size();x++) {
                if (array.get(x) == (j+1)) {
                    System.out.print((x+1)+" ");
                }
            }
            System.out.println();
        }
    }
}

