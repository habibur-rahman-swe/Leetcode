// Last updated: 10/20/2025, 11:35:44 AM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
        	hm.put(nums[i], i);
        }
        
        for (int[] x : operations) {
        	if (hm.containsKey(x[0])) {
        		int idx = hm.get(x[0]);
        		hm.remove(x[0]);
        		hm.put(x[1], idx);
        	}
        }
		for (int x : hm.keySet()) {
			nums[hm.get(x)] = x;
		}
		return nums;
    }
}