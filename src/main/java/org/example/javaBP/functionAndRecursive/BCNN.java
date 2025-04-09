package org.example.javaBP.functionAndRecursive;

import java.util.Scanner;

public class BCNN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i]= scanner.nextInt();
        }
        System.out.println(tinhBCNNMang(array));
        scanner.close();
    }
    //C1
    public static int BCNN(int a, int b) {
        int max = Math.max(a, b);
        int BCNN = max;
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 & i % b == 0) {
                BCNN = i;
                break;
            }
        }
        return BCNN;
    }

    public static int tinhBCNNMang(int[] array) {
        int BoiChung = array[0];
        for (int i = 1; i < array.length; i++) {
            BoiChung = BCNN(BoiChung, array[i]);
        }
        return BoiChung;
    }
}
