package org.example.javaBP.functionAndRecursive;

import java.util.Scanner;

public class DayNhiPhanDep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        if (n % 2 == 0 && n >= 1 && n <= 20) {
            binaryList(n, "");
        }
    }

    public static void binaryList(int n, String current) {
        if (current.length() == n) {
            int x = Integer.parseInt(current);
            if (tinhTong(x) == (n / 2)) {
                System.out.println(current);
            }
            return;
        }
        // Đệ quy thêm '0' và '1' vào chuỗi hiện tại
        binaryList(n, current + "0");
        binaryList(n, current + "1");
    }

    public static int tinhTong(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Lấy chữ số cuối cùng
            number /= 10;       // Loại bỏ chữ số cuối
        }
        return sum;
    }
}