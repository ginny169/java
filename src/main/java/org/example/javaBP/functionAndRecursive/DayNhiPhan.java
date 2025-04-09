package org.example.javaBP.functionAndRecursive;

import java.util.Scanner;

public class DayNhiPhan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        binaryList(n, "");
    }

    public static void binaryList(int n, String current) {
        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        // Đệ quy thêm '0' và '1' vào chuỗi hiện tại
        binaryList(n, current + "0");
        binaryList(n, current + "1");
    }
}