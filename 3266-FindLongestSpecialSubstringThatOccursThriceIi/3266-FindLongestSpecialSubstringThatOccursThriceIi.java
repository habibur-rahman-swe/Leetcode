// Last updated: 10/20/2025, 11:32:06 AM
class Solution {
    public int maximumLength(String s) {
        int ans = -1;
        for (char c = 'a'; c <= 'z'; c++) {
            ans = Math.max(ans, getAns(c, s));
        }
        return ans;
    }
    
    public int getAns(char c, String s) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) ++cnt;
            else {
                if (cnt != 0) map.put(cnt, map.getOrDefault(cnt, 0) + 1);
                cnt = 0;
            }
        }
        
        int ans = -1;
        if (cnt != 0) {
            map.put(cnt, map.getOrDefault(cnt, 0) + 1);
            cnt = 0;
        }
        
        while (map.size() > 0) {
            int last = map.lastKey();
            
            if (map.get(last) == 2) {
                ans = Math.max(last - 1, ans);
            }
            
            if (map.get(last) > 2 || cnt > 0) {
                ans = Math.max(last, ans);
            }
            
            if (last - 2 > 0) {
                ans = Math.max(ans, last - 2);
            }
            
            map.remove(last);
            ++cnt;
            if (cnt > 1) break;
        }
        return ans == 0 ? -1 : ans;
    }
}