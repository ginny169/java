package org.example.javaBP.functionAndRecursive;

import java.util.Scanner;

public class SoChuanChan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if (checkSoChan(number)&&checkSoChuanChan(number)){
            System.out.println("YES");
        } else System.out.println("NO");
    }

    //Dem so le va chan va return true neu chan> le
    public static boolean checkSoChuanChan(long n) {
        String number = Long.toString(n);
        int chan = 0;
        int le = 0;

        for (char diN : number.toCharArray()){
            int x = Character.getNumericValue(diN);
            if (x%2==0){
                chan++;
            } else {
                le++;
            }
        }
        return chan > le;
    }

    //ham check so so chan
    public static boolean checkSoChan(long n) {
        String number = Long.toString(n);
        int numberDi = number.length();
        return numberDi % 2 == 0;
    }
}
