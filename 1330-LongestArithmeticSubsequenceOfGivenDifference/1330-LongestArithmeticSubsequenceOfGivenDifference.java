// Last updated: 10/20/2025, 11:39:58 AM
class Solution {
    public int longestSubsequence(int[] arr, int difference) {

		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i] - difference, 0) + 1);
		}
		
		int max = 1;
		
		for (int x : map.keySet()) {
			max = Math.max(max, map.get(x));
		}
		
		return max;
	}
}