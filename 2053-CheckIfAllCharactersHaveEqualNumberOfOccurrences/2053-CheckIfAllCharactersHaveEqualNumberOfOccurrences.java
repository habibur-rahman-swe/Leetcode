// Last updated: 10/20/2025, 11:37:07 AM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        int max = 0;
        for (char c : s.toCharArray()) {
            arr[c-'a']++;
            max = arr[c-'a'];
        }
        for (int x : arr) {
            if (x == max || x == 0) continue;
            else return false;
        }
        return true;
    }
}