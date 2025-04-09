package org.example.java324.sort;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] str1 = {""};
        List<List<String>> result = groupAnagrams(str1);
        System.out.println(result);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        /*
        ý tưởng
        duyệt qua strs và sắp xếp từng phần tử the Alpha
        nếu như trùng thì add str nó vào 1 list
        nếu như chưa thì add nó vào 1 list mới.
        */

        //duyệt str và sắp xếp
        for (int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            //cach 1
            map.putIfAbsent(sortedStr,new ArrayList<>());
            map.get(sortedStr).add(strs[i]);

            //cach 2
//            if(!map.containsKey(sortedStr)){
//                map.put(sortedStr,new ArrayList<>());
//            }
//            map.get(sortedStr).add(strs[i]);
        }
        var answer = map.values();
        return new ArrayList<>(answer);
    }
}
