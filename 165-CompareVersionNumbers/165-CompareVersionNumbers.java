// Last updated: 10/20/2025, 11:46:04 AM
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int min = Math.min(v1.length, v2.length);
        for (int i = 0; i < min; i++) {
            int s1 = Integer.parseInt(v1[i]);
            int s2 = Integer.parseInt(v2[i]);
            
            if (s1 > s2) return 1;
            else if (s2 > s1) return -1;
        }
        int idx = min;
        while (idx < v1.length) {
            if (Integer.parseInt(v1[idx]) > 0) return 1;
            idx++;
        }

        while (idx < v2.length) {
            if (Integer.parseInt(v2[idx]) > 0) return -1;
            idx++;
        }

        return 0;
    }
}