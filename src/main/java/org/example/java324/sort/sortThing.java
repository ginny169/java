package org.example.java324.sort;

import java.util.*;

public class sortThing {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            int number = scanner.nextInt();
//            array[i] = number;
//        }
//        System.out.println(missingNumber(array));

//        String s = "tree";
//        System.out.println(frequencySort(s));

//      System.out.println(containsDuplicate(array));

        String[] votes = {"ABC", "ACB", "ABC", "ACB", "ACB"};
        String[] vote2 = {"WXYZ", "XYZW"};
        String[] vote3 = {"ZMNAGUEDSJYLBOPHRQICWFXTVK"};

        System.out.println(rankTeams(votes));
        System.out.println(rankTeams(vote2));
        System.out.println(rankTeams(vote3));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k) {
                return k;
            }
        }
        return nums.length;
    }

    public static String frequencySort(String s) {

        HashMap<Character, Integer> result = new HashMap<>();

        //duyệt string, nếu gặp kí tự chưa có thì tạo mới, nếu có rồi value tăng 1
        for (int i = 0; i < s.length(); i++) {
            if (!result.containsKey(s.charAt(i))) {
                result.put(s.charAt(i), 1);
            } else result.put(s.charAt(i), result.get(s.charAt(i)) + 1);
        }

        //Sort giảm dần.
        List<Character> ch = new ArrayList<>(result.keySet());
        ch.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if (result.get(o2) > result.get(o1)) {
                    return 1;
                }
                if (result.get(o2) < result.get(o1)) {
                    return -1;
                }
                return 0;
            }
        });

        //Chuyển từ kiểu ArrayList sang string.
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < ch.size(); i++) {
            for (int k = 0; k < result.get(ch.get(i)); k++) {
                st.append(ch.get(i));
            }
        }
        return st.toString();
    }

    public static String rankTeams(String[] votes) {
        Map<Character, int[]> teamVotes = new HashMap<>();

        //Lọc đầu vào votes và đánh dấu các vote của từng team
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {

                // add kí tự vào trong result key
                if (!teamVotes.containsKey(vote.charAt(i))) {
                    teamVotes.put(vote.charAt(i), new int[vote.length()]);
                }
                // đánh dấu vị trí vote của mỗi chracter khi duyệt mỗi vote.
                teamVotes.get(vote.charAt(i))[i]++;
            }
        }

        // Bắt đầu tiến hành tính toán (team nào được vote nhiều nhất ở int[0] --> hạng nhất, tương tự với các giải sau.
        //1.Tạo list team và sort theo tỉ lệ vote của mỗi giải.
        List<Character> teams = new ArrayList<>(teamVotes.keySet());

        int numTeams = votes[0].length();
        //sort teams by votes
        Collections.sort(teams, (team1, team2) -> {
            int[] vote1 = teamVotes.get(team1);
            int[] vote2 = teamVotes.get(team2);

            for (int i = 0; i < numTeams; i++) {
                if (vote1[i] != vote2[i]) {
                    return vote2[i] - vote1[i];
                }
            }

            //nếu bằng nhau rank them alphabetically based on their team letter.
            return Character.compare(team1, team2);
        });

        //In ra kết quả
        StringBuilder result = new StringBuilder();
        for (char team: teams){
            result.append(team);
        }

        return result.toString();
    }
}
