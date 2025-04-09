package org.example.javaBP.onboarding;

public class validParentheses {
    public static void main(String[] args) {
        String s = "}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        int countA = 0;
        int countB = 0;
        int countC = 0;


        if (s.length() % 2 != 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('(')) {
                countA++;
                System.out.println(countA);
            } else {
                countA--;
                if (countA < 0) {
                    return false;
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('[')) {
                countB++;
            } else {
                countB--;
                if (countB < 0) {
                    return false;
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('{')) {
                countC++;
            } else {
                countC--;
                if (countC < 0) {
                    return false;
                }
            }
        }
        System.out.println(countA);
        System.out.println(countB);
        System.out.println(countC);
        return (countA+countB+countC) == 0;
    }
}

