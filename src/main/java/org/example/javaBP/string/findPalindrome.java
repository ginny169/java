package org.example.javaBP.string;

import java.util.Scanner;

public class findPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        if (isPalindrome2(A)){
            System.out.println("YES");
        }else System.out.println("NO");

        if (isPalindrome(A)){
            System.out.println("YES");
        }else System.out.println("NO");
    }

    //cách 1
    public static boolean isPalindrome(String B){
        String reverse =  new StringBuilder(B).reverse().toString();
        return B.equals(reverse);
    }

    //Cách 2
    public static boolean isPalindrome2(String B){
        boolean flag = true;
        for (int i=0; i< B.length()/2;i++){
            if (B.charAt(i) != B.charAt(B.length()-1 - i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
