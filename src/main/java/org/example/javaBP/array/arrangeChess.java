package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrangeChess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            array.add(number);
        }

        int max = findMax(array);
        printArray(newArray(array,max));

    }

    public static int findMax(ArrayList<Integer> array) {
        int max = 0;
        for (Integer integer : array) {
            if (integer >= max) {
                max = integer;
            }
        }
        return max;
    }

    public static void printArray(ArrayList<Integer> array) {
        for (Integer interger : array) {
            System.out.print(interger + " ");
        }
    }

    public static ArrayList<Integer> newArray(ArrayList<Integer> array, int size) {
        int point = 0;
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int j = 0; j < size; j++) {
            for (Integer interger : array) {
                if (interger - j >= 1) {
                    point = point + 1;
                }
            }
            newArray.add(point);
            point = 0;
        }
        return newArray;
    }
}

