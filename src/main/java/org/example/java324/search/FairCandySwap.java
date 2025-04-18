package org.example.java324.search;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {2,2};
        int[] bobSizes = {1,1};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));

    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        //sort
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int sumAlice = Arrays.stream(aliceSizes).sum();
        int sumBob = Arrays.stream(bobSizes).sum();

        int[] result = new int[2];
        int expect = (sumAlice-sumBob)/2;
        //cần tìm phần tử ở box của alce và bob sao cho alice[i]-bob[j] = div
        for (int a: aliceSizes){
            for (int b: bobSizes){
                while (a == (b + expect)){
                    result[0]=a;
                    result[1]=b;
                    return result;
                }
            }
        }
        return result;
    }
}
