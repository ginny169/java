package org.example.javaBP.onboarding;

import java.util.Scanner;

public class SoNguyenTo {

    //Tính tổng số nguyên tố
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum=0;
        for (int i=1;i<=N;i++)
        {
            int soNguyenTo =scanner.nextInt();
            if (checkSoNguyenTo(soNguyenTo)) {
                sum = sum + soNguyenTo;
            }
        }
        System.out.println(sum);

    }

    //hàm check số nguyên tố
    public static boolean checkSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
