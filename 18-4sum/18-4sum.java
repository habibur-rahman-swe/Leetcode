// Last updated: 10/20/2025, 11:48:53 AM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
		
		HashSet<ArrayList<Integer>> s = new HashSet<ArrayList<Integer>>();
		ArrayList<Integer> list;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					for (int l = k + 1; l < n; l++) {
						if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
							list = new ArrayList<>();
							list.add(nums[i]);
							list.add(nums[j]);
							list.add(nums[k]);
							list.add(nums[l]);
							s.add(list);
						}
					}
				}
			}
		}
		
		
		List<List<Integer>> res = new ArrayList<>(s);
        
        return res;
    }
}