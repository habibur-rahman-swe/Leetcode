// Last updated: 10/20/2025, 11:44:21 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ran = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            ran.put(c, ran.getOrDefault(c, 0) + 1);
        }
        
        HashMap<Character, Integer> maz = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            maz.put(c, maz.getOrDefault(c, 0) + 1);
        }
        
        for (char c = 'a'; c <= 'z'; c++) {
            if (ran.getOrDefault(c, 0) > maz.getOrDefault(c, 0)) return false;
        }
        
        return true;
    }
}