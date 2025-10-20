// Last updated: 10/20/2025, 11:34:20 AM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            if (isVowelString(words[i])) ++cnt;
        }
        return cnt;
    }
    
    private boolean isVowelString(String s) {
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1));
    }
    
    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
}