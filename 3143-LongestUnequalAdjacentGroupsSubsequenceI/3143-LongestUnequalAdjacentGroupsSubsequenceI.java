// Last updated: 10/20/2025, 11:32:53 AM
class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> res1 = getRes(words, groups, 0);
        List<String> res2 = getRes(words, groups, 1);
        
        int size1 = getSize(res1);
        int size2 = getSize(res2);
        
        
        return size1 > size2 ? res1 : res2;
    }
    
    public int getSize(List<String> list) {
        int size = 0;
        for (String x : list) {
            size += x.length();
        }
        return size;
    }
    
    public List<String> getRes(String[] words, int[] groups, int prev) {
        String max = "";
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (prev == groups[i]) {
                if (max.length() < words[i].length()) {
                    max = words[i];
                }
            } else {
                if (max.length() > 0) result.add(max);
                max = words[i];
                prev = groups[i];
            }
        }
        result.add(max);
        return result;
    }
}