package org.example.java324.sort.sort3;

import java.util.*;

public class CountDaysWithMeetings {
    public static void main(String[] args) {
        int[][] arr = {{5, 7}, {8, 9}, {3, 10}};
        System.out.println(countDays(10, arr));

    }

    public static int countDays(int days, int[][] meetings) {
        /*
        - sort theo startDate.
        - for i -> length
        -- result += meetings[i][0]-meetings[i-1][1]
        result = startDate[0][0] - 1 + result + days - endDate[i][1].
         */
        //{{1,3}, {5,10}, {7, 9}, {12, 13}
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int result = 0;
        int maxEnddate = meetings[0][1];
        for (int i = 1; i < meetings.length; i++){
            if (meetings[i][0] > maxEnddate){
                result = result + meetings[i][0] - maxEnddate - 1;
            }
            maxEnddate = Math.max(meetings[i][1],maxEnddate);
        }
        result = meetings[0][0] - 1 + result + days - maxEnddate;
        return result;
    }
}
