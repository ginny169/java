package org.example.javaBP.functionAndRecursive;

import java.math.BigInteger;
import java.util.Scanner;

public class UocChungLonNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger gcd = A.gcd(B);
        System.out.println(gcd);

        scanner.close();
    }
}
