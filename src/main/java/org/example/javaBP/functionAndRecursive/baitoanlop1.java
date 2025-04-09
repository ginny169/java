package org.example.javaBP.functionAndRecursive;

import java.util.Scanner;

public class baitoanlop1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        long b = scanner.nextLong();
        float x = (int) (a%b);
        System.out.println(x);
    }

}
