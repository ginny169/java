package org.example.java324.sort.sort3;

import java.util.*;

public class MiceCheese {
    public static void main(String[] args) {
        int[] reward1 = {1, 2, 3, 5};
        int[] reward2 = {3, 1, 1, 2};

        int k = 2;
        System.out.println(miceAndCheese(reward1, reward2, k));

    }
    
    static class RewardData{
        int reward1;
        int reward2;
    }

    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        /*
        - 
         */
        List<RewardData> rewardList = new ArrayList<>();
        for (int i = 0; i < reward1.length; i++) {
            RewardData rewardData = new RewardData();
            rewardData.reward1 = reward1[i];
            rewardData.reward2 = reward2[i];
            rewardList.add(rewardData);
        }

        Collections.sort(rewardList, new Comparator<RewardData>() {
            @Override
            public int compare(RewardData o1, RewardData o2) {
                return (o1.reward1 - o1.reward2) - (o2.reward1 - o2.reward2);
            }
        });

        int result = 0;
        for (int i = rewardList.size()-1; i>= rewardList.size() - k; i--){
            result = result + rewardList.get(i).reward1;
        }
        for (int i = rewardList.size() - k-1; i>=0; i--){
            result = result + rewardList.get(i).reward2;
        }

        return result;
    }
}
