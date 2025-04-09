package org.example.javaBP.onboarding;

import java.util.Arrays;
import java.util.Scanner;

public class transform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] soNguyen = new int[N];
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            soNguyen[i] = x;
        }
    }

    public static int[] changNtoB(int[] nums) {
        int[] ketqua = new int[nums.length];
        for (int i =0; i< nums.length; i++){
            if (nums[i]%2 !=0){
                ketqua[i]=1;
            }
        }
        return Arrays.stream(ketqua).sorted().toArray();
    }


}
