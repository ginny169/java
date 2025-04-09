package org.example.javaBP.functionAndRecursive;

import java.util.Scanner;

public class ThapHaNoi {

    public static void solveHanoi(int n, char from, char to, char mid) {
        // Nếu chỉ còn một đĩa, di chuyển trực tiếp từ cột from -> to
        if (n == 1) {
            System.out.println(from + " -> " + to);
            return;
        }
        // Di chuyển N-1 đĩa từ from -> aux (sử dụng to làm trung gian)
        solveHanoi(n - 1, from, mid, to);

        // Di chuyển đĩa lớn nhất từ from -> to
        System.out.println(from + " -> " + to);

        // Di chuyển N-1 đĩa từ aux -> to (sử dụng from làm trung gian)
        solveHanoi(n - 1, mid, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solveHanoi(N, 'A', 'C', 'B');
    }

}
