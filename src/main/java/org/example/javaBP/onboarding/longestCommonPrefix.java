package org.example.javaBP.onboarding;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"

        // Example 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2)); // Output: ""

    }

    public static String longestCommonPrefix(String[] strs) {
        // If the input array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "null";
        }

        // Assume the first string is the longest common prefix
        String prefix = strs[0];

//        for (int i = 1; i < strs.length; i++) {
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) {
//                    return "null";
//                }
//            }
//        }

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }

        // Return the longest common prefix
        return prefix;
    }
}

