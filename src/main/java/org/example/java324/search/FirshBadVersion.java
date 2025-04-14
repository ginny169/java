package org.example.java324.search;

public class FirshBadVersion {
    public static class VersionControl {
        private static int firstBadVersion;

        private VersionControl(int bad) {
            firstBadVersion = bad;
        }

        public static boolean isBadVersion(int version) {
            return version >=firstBadVersion;
        }
    }

    public class Solution extends VersionControl {
        private Solution(int bad) {
            super(bad);
        }

        public int firstBadVersion(int n) {
            int result = n;
            int left = 1;
            int right = n;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    result = mid;
                    right = mid - 1;
                }
                if (!isBadVersion(mid)) {
                    left = mid + 1;
                }
            }
            return result;
        }
    }
}
