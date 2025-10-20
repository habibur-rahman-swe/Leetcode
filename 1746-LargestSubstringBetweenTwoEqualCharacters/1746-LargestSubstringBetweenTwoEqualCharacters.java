// Last updated: 10/20/2025, 11:38:14 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        int ans = -1;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == -1)arr[s.charAt(i) - 'a'] = i;
            else ans = Math.max(i - arr[s.charAt(i) - 'a'] - 1, ans);
        }
        return ans;
    }
}