package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class findMaxMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
                array.add(number);
        }
        Collections.sort(array);

//        System.out.println(array);
        int x = array.get(0)*array.get(1);
        int y = array.get(array.size()-1)*array.get(array.size()-2);
        int max = Math.max(x, y);
        System.out.println(max);
    }
}

