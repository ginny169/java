package org.example.javaBP.string;

import java.util.Scanner;

public class findString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        if (isContain(A,B)){
            System.out.println("YES");
        }else System.out.println("NO");
    }

    public static boolean isContain(String A, String B){
        return A.contains(B);
    }

}
