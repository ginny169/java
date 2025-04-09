package org.example.javaBP.string;

import java.util.Scanner;

public class randomSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] useName = new String[N];
        for (int i = 0; i < N; i++) {
            useName[i] = scanner.nextLine();
        }

        int[] orderList = new int[N];
        for (int i = 0; i < N; i++) {
            orderList[i] = scanner.nextInt();
        }

        serveOrder(useName, orderList);
    }

    public static void serveOrder(String[] list, int[] order) {
        String[] orderServe = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            orderServe[order[i]-1]=list[i];
        }
        for (String s : orderServe) {
            System.out.println(s);
        }
    }

//    public static int getIndex(int[] arr, int value) {
//        int order = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == value) {
//                order = i;
//                return order;
//            }
//        }
//        return order;
//    }
}
