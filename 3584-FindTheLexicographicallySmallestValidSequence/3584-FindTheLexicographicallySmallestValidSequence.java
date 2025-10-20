// Last updated: 10/20/2025, 11:31:45 AM
class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[] last = new int[m];
        Arrays.fill(last, -1);

        for (int i = n - 1, j = m - 1; i >= 0 && j >= 0; i--) {
            if(word1.charAt(i) == word2.charAt(j)) {
                last[j--] = i;
            } 
        }
        for (int i = 0; i < m; i++) {
            System.out.print(last[i] + " ");
        }
        int j = 0, res[] = new int[m];
        boolean skip = false;
        
        for (int i = 0; i < n && j < m; i++) {
            if (word1.charAt(i) == word2.charAt(j) || (!skip && (j == m - 1 || i < last[j + 1]))) {
                res[j] = i;
                skip |= word1.charAt(i) != word2.charAt(j);
                j++;
            }
        }
        return j == m ? res : new int[0];
    }
}