// Last updated: 10/20/2025, 11:32:03 AM
class Solution {
    public int maximumLength(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = s.length() - 2; i >= 1; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                String substring = s.substring(j, j+i);
                
                if (!repeted(substring)) continue;
                
                int hashCode = substring.hashCode();
                
                map.put(hashCode, map.getOrDefault(hashCode, 0) + 1);
                if (map.get(hashCode) > 2) {
                    System.out.println(s.substring(j, j+i));
                    return i;
                }
            }
        }
        return -1;
    }
    
    private boolean repeted(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        return arr[s.charAt(0) - 'a'] == s.length();
    }
}