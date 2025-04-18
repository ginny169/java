package org.example.java324.search;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        System.out.println(book(10, 20));
        System.out.println(book(15, 25));
        System.out.println(book(20, 30));
    }

    public static List<int[]> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }

    public static boolean book(int startTime, int endTime) {
        for (int[] book : bookings) {
            int start = book[0];
            int end = book[1];
            if (startTime <= end && endTime>start){
                return false;
            }
        }
        bookings.add(new int[]{startTime,endTime});
        return true;
    }

}
