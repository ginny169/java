package org.example.javaBP.onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);

        // In kết quả
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Bước 1: Sắp xếp mảng
        Arrays.sort(nums);

        // Bước 2: Duyệt qua từng phần tử
        for (int i = 0; i < nums.length - 2; i++) {
            // Tránh trùng lặp với phần tử trước đó
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Bước 3: Sử dụng hai con trỏ để tìm cặp còn lại
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Nếu tổng = 0, lưu bộ ba vào kết quả
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Tránh trùng lặp với phần tử sau đó
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Di chuyển con trỏ vào trong
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Nếu tổng nhỏ hơn 0, di chuyển con trỏ trái vào phải
                    left++;
                } else {
                    // Nếu tổng lớn hơn 0, di chuyển con trỏ phải vào trái
                    right--;
                }
            }
        }

        return result;
    }
}

