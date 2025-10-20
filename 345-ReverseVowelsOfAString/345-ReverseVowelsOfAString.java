// Last updated: 10/20/2025, 11:44:40 AM
class Solution {
    public String reverseVowels(String str) {
        char[] reverse = reverse(str.toCharArray(), 0, new LinkedList<>());

        return String.valueOf(reverse);
    }

    public char[] reverse(char[] s, int i, Queue<Character> queue) {
        if (i >= s.length) {
            return s;
        }
        
        char c = Character.toLowerCase(s[i]);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            queue.offer(s[i]);
        }
        
        reverse(s, i + 1, queue);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            s[i] = queue.poll();
        }
        return s;
    }
}