// Last updated: 10/20/2025, 11:34:43 AM
class Solution {
    public boolean isItPossible(String word1, String word2) {
		int[] a = new int[26];
		int[] b = new int[26];
		
		for (char c : word1.toCharArray()) {
			a[c - 'a']++;
		}
		
		for (char c : word2.toCharArray()) {
			b[c - 'a']++;
		}
		
		int cntA = 0, cntB = 0;
		
		for (int i = 0; i < 26; i++) {
			if (a[i] > 0) ++cntA;
			if (b[i] > 0) ++cntB;
		}
		
		if (cntA == cntB && word1.length() == word2.length()) {
			return true;
		}
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				if (a[i] == 0 || b[j] == 0 || i == j) continue;
				
				int tempA = cntA, tempB = cntB;
				
				if (a[j] == 0) tempA++;
				if (a[i] == 1) tempA--;
				
				if (b[i] == 0) tempB++;
				if (b[j] == 1) tempB--;
				
				if (tempA == tempB) return true;
			}
		}

		return false;
	}
}