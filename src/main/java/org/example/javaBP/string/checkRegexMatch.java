package org.example.javaBP.string;

import java.util.Scanner;

public class checkRegexMatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,999}$";
        String A = scanner.nextLine();
        if (isMatchRegex(A,regex)){
            System.out.println("YES");
        }else System.out.println("NO");
    }

    public static boolean isMatchRegex(String A, String regex){
        return A.matches(regex);
    }

}
