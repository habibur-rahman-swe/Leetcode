// Last updated: 10/20/2025, 11:36:09 AM
class Solution {
    public int minSteps(String s, String t) {
        int arr[] = new int[26];
        int brr[] = new int[26];
        
        for (char c : s.toCharArray()) arr[c-'a']++;
        for (char c : t.toCharArray()) brr[c-'a']++;
        
        int ans = 0;
        for (int i = 0; i < 26; i++) ans += Math.abs(arr[i]-brr[i]);
        return ans;
    }
}