// Last updated: 10/20/2025, 11:43:39 AM
class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String ss : str) {
            sb.append((new StringBuilder(ss)).reverse() + " ");
        }

        return (new String(sb)).trim();
    }
}