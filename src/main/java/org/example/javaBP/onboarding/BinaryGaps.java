package org.example.javaBP.onboarding;

import java.util.Scanner;

public class BinaryGaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        System.out.println(changNtoB(N).reverse());
        System.out.println(changeNtoB(N).toString());
    }

    public static StringBuilder changNtoB(int N) {
        StringBuilder binary = new StringBuilder();
        int soDu = N;
        int nguyen;
        while (soDu!=0){
            nguyen = soDu%2;
            binary.append(nguyen);
            soDu = soDu/2;
        }
        return binary;
    }

    public static String changeNtoB(int N) {
        String binary = "";
        int soDu = N;
        int nguyen;
        while (soDu!=0){
            nguyen = soDu%2;
            binary = nguyen + binary;
            System.out.println(binary);
            soDu = soDu/2;
        }
        return binary;
    }

//    public static int changNtoB(int N) {
//        String binary = Integer.toBinaryString(N);
//        System.out.println(binary);
//        int currentGap = 0;
//        int maxGap = 0;
//        boolean isInsideGap = false;
//        for (int i = 0; i < binary.length(); i++) {
//            char c = binary.charAt(i);
//            if (c == '1') {
//                if (isInsideGap) {
//                    maxGap = Math.max(currentGap, maxGap);
//                    currentGap = 0;
//                }
//                isInsideGap = true;
//            } else if (isInsideGap) {
//                currentGap++;
//            }
//        }
//        return maxGap;
//    }
}
