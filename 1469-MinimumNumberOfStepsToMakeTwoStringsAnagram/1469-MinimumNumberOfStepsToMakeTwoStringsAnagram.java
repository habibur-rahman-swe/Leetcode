// Last updated: 10/20/2025, 11:39:24 AM
class Solution {
    public int minSteps(String s, String t) {
        int[] ar = new int[26]; for (char c : s.toCharArray()) ar[c - 'a']++;
        int[] br = new int[26]; for (char c : t.toCharArray()) br[c - 'a']++;

        int cnt =  0; for (int i = 0; i < 26; i++) cnt += Math.abs(ar[i] - br[i]);

        return cnt / 2;
    }
}