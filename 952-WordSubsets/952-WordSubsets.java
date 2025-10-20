// Last updated: 10/20/2025, 11:41:26 AM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] bmax = count("");
        for (String b : words2) {
            int[] bCount = count(b);
            for (int i = 0; i < 26; i++) {
                bmax[i] = Math.max(bmax[i], bCount[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        search: for (String a : words1) {
            int[] aCount = count(a);
            for (int i = 0; i < 26; i++) {
                if (aCount[i] < bmax[i]) continue search;
            }
            ans.add(a);
        }
        return ans;
    }
    public int[] count(String s) {
        int[] ans = new int[26];
        for (char c : s.toCharArray()) {
            ans[c - 'a']++;
        }
        return ans;
    }
}