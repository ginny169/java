package org.example.javaBP.functionAndRecursive;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ToHop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte k = scanner.nextByte();
        scanner.nextLine();
        DecimalFormat df = new DecimalFormat("#.##"); // Không in phần thập phân nếu không cần
        System.out.println(df.format(combination(n,k)));
    }

    //ham check
    public static double giaiThua(int n) {
        if (n<=2) return n;
        return giaiThua(n-1)*n;
    }

    // Hàm tính tổ hợp C(K, N)
    public static double combination(int n, int k) {
        if (k > n) return 0;
        if (k ==1) return n;
        if (k == n) return 1; // Trường hợp đặc biệt
        return giaiThua(n) / (giaiThua(k) * giaiThua(n - k));
    }
}
