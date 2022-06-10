class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        
        while (r < s.length()) {
            char c = s.charAt(r);
            if (hs.contains(c) && l < r) {
                hs.remove(s.charAt(l));
                l++;
            } else {
                hs.add(c);
                r++;
            }  
            ans = Math.max(ans, hs.size());
        }
        return ans;
    }
}