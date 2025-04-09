package org.example.javaBP.functionAndRecursive;

import java.util.Scanner;

public class RutGon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(rutGon(n));
    }

    //ham check so so chan
    public static int rutGon(int n) {
        if (n == 0) {
            return 0;
        }
        while (n > 10) {
            n = tinhTongCacSo(n);
        }
        return n;

    }

    public static int tinhTongCacSo(int n) {
        int sum = 0;
        while (n>0){
            sum +=n%10;
            n /=10;
        }
        return sum;
    }
}
