// Last updated: 10/20/2025, 11:38:58 AM
class Solution {
    public int maxVowels(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i >= k && hm.containsKey(s.charAt(i-k))) {
                hm.put(s.charAt(i-k), hm.get(s.charAt(i-k)) - 1);
            }
            if (isVowel(s.charAt(i))) {
                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            }
            if (i >= k - 1) {
                int sum = 0;
                for (char c : hm.keySet()) {
                    sum += hm.get(c);
                }
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
}