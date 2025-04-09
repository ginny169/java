//package org.example.java324.sort;
//
//import java.util.*;
//
//public class AssignCookies {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int N = scanner.nextInt();
//        int[] g = {1, 2};
//        int[] s = {1, 1, 3};
//
//        System.out.println(findContentChildren(g, s));
//
//    }
//
//    public static int findContentChildren(int[] g, int[] s) {
//        QuickSort quickSort = new QuickSort();
//        quickSort.doQuickSort(g, 0, g.length - 1, );
//        quickSort.doQuickSort(s, 0, s.length - 1, );
//
//        int cookie = 0;
//        int ch = 0;
//        int result = 0;
//
//        //cach 1
//        while (ch < g.length && cookie < s.length) {
//            if (g[ch] <= s[cookie]) {
//                result ++;
//                ch ++;
//                cookie++;
//            }
//            cookie++;
//        }
//
////        //cach 2
//        //cach 1
//        for (int i = 0; i < s.length; i++){
//            if (g[ch] <= s[i]) {
//                result ++;
//                ch ++;
//                if (ch==g.length){
//                    break;
//                }
//            }
//        }
//        return result;
//    }
//}
