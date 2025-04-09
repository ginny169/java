package org.example.javaBP.onboarding;

public class test1 {
    public static void main(String[] args) {
        test1 test = new test1();
        System.out.println(solution("aabb"));
    }

    public static boolean solution(String S) {
        boolean containA = false;
        boolean containB = false;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                containA = true;
            }
            if (S.charAt(i) == 'b') {
                containB = true;
            }
        }
//        System.out.println("containA: " + containA);
//        System.out.println("containB: " + containB);

        if (!containA) {
            return true;
        } else if (!containB) {
            return true;
        } else {
//            System.out.println(S.contains("ba"));
            return !S.contains("ba");
        }
    }
}
