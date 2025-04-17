package org.example.java324.search;

import java.util.*;

public class MostProfitAssignWork {
    public static void main(String[] args) {
        int[] difficulty = {2,4,6,8,10};
        int[] profit = {10,20,30,40,50};
        int[] worker = {4,5,6,7};

        int total = maxProfitAssignment(difficulty, profit, worker);
        System.out.println("Total maximum profit: " + total);
    }

    public static class Job {
        int difficulty;
        int profit;

        public Job(int difficulty, int profit) {
            this.difficulty = difficulty;
            this.profit = profit;
        }
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        /*
        ý tưởng coi từng phần tử ở worker là target
        duyệt dificulty --> lấy phần từ lớn nhất có giá trị <= worker.
        */

        int n = difficulty.length;
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobs.add(new Job(difficulty[i], profit[i]));
        }

        //sắp xếp job theo độ khó
        jobs.sort(Comparator.comparingInt(j -> j.difficulty));

        //xử lý dificult và profit theo max profit
        for (int i = 1; i < n; i++) {
            jobs.get(i).profit = Math.max(profit[i], profit[i - 1]);
        }

        int total = 0;
        for (int w : worker) {
            int index = findUpperBound(jobs, w);
            if (index > 0) {
                total = total + jobs.get(index - 1).profit;
            }
        }
        return total;
    }

    public static int findUpperBound(List<Job> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr.get(mid).difficulty > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
