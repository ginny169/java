package org.example.java324.sort.sort3;

import java.util.*;

public class CountDaysWithMeetings {
    public static void main(String[] args) {
        int[][] arr = {{5, 7}, {1, 3}, {9, 10}};
        System.out.println(countDays(10, arr));

    }

    public static int countDays(int days, int[][] meetings) {
        //sort by phần tử thứ 2 của mỗi []
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int meetingDays = 0;
        int mergedStart = meetings[0][0];
        int mergeEnd = meetings[0][1];

        for (int i = 1; i < meetings.length; i++) {
            int curStart = meetings[i][0];
            int curEnd = meetings[i][1];

            if (curStart < mergeEnd) {
                mergeEnd = Math.max(mergeEnd, curEnd);
            } else {
                meetingDays += mergeEnd - mergedStart + 1;
                mergedStart = curStart;
                mergeEnd = curEnd;
            }
        }
        meetingDays += mergeEnd - mergedStart + 1;

        return days - meetingDays;
    }
}
