package org.example.javaBP.array;

import java.util.*;

public class findMax {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int N = scanner.nextInt();
////        ArrayList<Integer> array = new ArrayList<>();
////        for (int i = 0; i < N; i++) {
////            int number = scanner.nextInt();
////            array.add(number);
////        }
////        System.out.print(findMax(array)+" ");
////        System.out.println(appearCount(array, findMax(array)));
//
//
//    }
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByValue())
                .forEach(System.out::println);
    }

    public static int findMax(ArrayList<Integer> array) {
        int max = 0;
        for (Integer integer : array) {
            if (integer >= max) {
                max = integer;
            }
        }
        return max;
    }

    public static int appearCount(ArrayList<Integer> array, int x) {
        int appearCount = 0;
        for (Integer integer : array) {
            if (integer == x) {
                appearCount = appearCount + 1;
            }
        }
        return appearCount;
    }
}

