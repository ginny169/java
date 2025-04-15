package org.example.java324.sort.sort3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMatrixByDiagonals {

    public static void main(String[] args) {
        int[][] grid = {
                {2, 7, 4},
                {1, 1, 1},
                {1, 3, 6}
        };

        int[][] sorted = sortMatrix(grid);
        printMatrix(sorted);
    }

    public static int[][] sortMatrix(int[][] grid) {
        //sắp xếp đường chéo tăng dần ở phần trên
        int n = grid.length;
        //chạy từ cột 1
        for (int col = 1; col < n; col++) {
            List<Integer> listStream = new ArrayList<>();
            //chạy từ grid[0][1] --> đến khi j,j>=n
            int i = 0;
            int j = col;

            while (i < n && j < n) {
                listStream.add(grid[i][j]);
                i++;
                j++;
            }

            Collections.sort(listStream);

            //chạy lại để gán lại giá trị cho các giá trị

            i = 0;
            j = col;
            for (int value : listStream) {
                grid[i][j] = value;
                i++;
                j++;
            }
        }

        //sắp xếp đường chéo giảm dần ở phần dưới
        for (int row = 0; row < n; row++) {
            List<Integer> listStream = new ArrayList<>();
            int i = row;
            int j = 0;
            while (i < n && j < n) {
                listStream.add(grid[i][j]);
                i++;
                j++;
            }

            listStream.sort(Collections.reverseOrder());

            i = row;
            j = 0;
            for (int value : listStream){
                grid[i][j] = value;
                i++;
                j++;
            }

        }

        return grid;
    }

    public static void printMatrix(int[][] grid) {
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
}
