package org.example.javaBP.onboarding;

import java.util.Scanner;

public class TinhTayBa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] lovers;
        lovers = new int[N];
        for (int i=0;i<N;i++)
        {
            int x = scanner.nextInt();
            lovers[i]= x;
        }
        if (checkTinhTayBa(lovers)) {
            System.out.println("YES");
        }else System.out.println("NO");;
    }

    public static boolean checkTinhTayBa(int[] n) {
        if (n.length < 3) {
            return false;
        }else {
            for (int i =0; i< n.length; i++){
                int blove = n[i];
                int clove = n[blove-1];
                if (n[clove-1]==i+1){
                    return true;
                }
            }
            return false;
        }
    }
}
