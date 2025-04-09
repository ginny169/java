package org.example.javaBP.onboarding;

import java.util.Scanner;

public class FindWinner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

       int tongkhoangcachA = Math.abs(A-B)+ Math.abs(A-C);
       int tongkhoangcachB = Math.abs(B-C)+ Math.abs(B-A);
       int tongkhoangcachC = Math.abs(C-B)+ Math.abs(C-A);

       if (tongkhoangcachA<tongkhoangcachB&&tongkhoangcachA<tongkhoangcachC) {
           System.out.println("Ti");
       }else if (tongkhoangcachB==tongkhoangcachC&&tongkhoangcachA==tongkhoangcachB){
           System.out.println("Ti Teo Tum");
       }else if (tongkhoangcachA==tongkhoangcachC) {
          System.out.println("Ti Tum");
       }else if (tongkhoangcachA==tongkhoangcachB&&tongkhoangcachA<tongkhoangcachC){
               System.out.println("Ti Teo");
       }else if (tongkhoangcachB==tongkhoangcachC){
           System.out.println("Tum Teo");
       }else if (tongkhoangcachB<tongkhoangcachC){
           System.out.println("Teo");
       }else
           System.out.println("Tum");
       }
    }
