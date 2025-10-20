// Last updated: 10/20/2025, 11:38:22 AM
class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<Integer> seen = new HashSet<>();
        return backtrack(0, s, seen);
    }

    private int backtrack(int start, String s, HashSet<Integer> seen) {
        if (start == s.length()) return 0;

        int maxCount = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            int hashCode = s.substring(start, end).hashCode();
            if (!seen.contains(hashCode)) {
                seen.add(hashCode);
                maxCount = Math.max(maxCount, 1 + backtrack(end, s, seen));
                seen.remove(hashCode);
            }
        }
        return maxCount;
    }
}