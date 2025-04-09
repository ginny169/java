package org.example.javaBP.array;

import java.util.ArrayList;
import java.util.Scanner;

public class oppositeNumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            array.add(number);
        }
        System.out.println(countOppositalCouple(array));
    }

    public static int countOppositalCouple(ArrayList<Integer> array){
        int count = 0;
        for (int i = 0; i< array.size()-1; i++){
            for (int j = i+1; j<array.size(); j++){
                if (array.get(i) > array.get(j)){
//                    System.out.print(array.get(i));
//                    System.out.println(array.get(j));
                    count=count+1;
                }
            }
        }
        return count;
    }
}
