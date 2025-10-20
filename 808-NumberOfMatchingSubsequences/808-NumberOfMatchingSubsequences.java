// Last updated: 10/20/2025, 11:42:10 AM
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int cnt = 0;
        
        HashSet<String> has = new HashSet<>();
        HashSet<String> not = new HashSet<>();
        
        for (String w : words) {
            int i = 0, j = 0;
            
            if (has.contains(w)) {
                ++cnt;
                continue;
            }
            
            if (not.contains(w)) {
                continue;
            }
            
            while (i < s.length() && j < w.length()) {
                if (s.charAt(i) == w.charAt(j)) {
                    j++;
                }
                i++;
            }
            
            if (j == w.length()) {
                ++cnt;
                has.add(w);
            } else {
                not.add(w);
            }
        }
        return cnt;
    }
}