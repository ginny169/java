package org.example.javaBP.string;

import java.util.Objects;
import java.util.Scanner;

public class containsString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        if (isSubsequence(A, B)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    public static boolean isSubsequence(String A, String B) {
        int j=0;
        String[] arrayA = A.split("");
//        System.out.println(Arrays.toString(arrayA));
        String[] arrayB = B.split("");
//        System.out.println(Arrays.toString(arrayB));

        for (int i = 0; i< A.length(); i++) {
            if (j<B.length()&& Objects.equals(arrayA[i], arrayB[j])) {
                j++;
            }
            if (j==B.length()){
                return true;
            }

        }
        return false;
    }

}
