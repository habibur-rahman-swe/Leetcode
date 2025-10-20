// Last updated: 10/20/2025, 11:43:54 AM
class Solution {
    private void backtrack(int[] nums, int index, List<Integer> sequence, Set<List<Integer>> result) {
		if (index == nums.length) {
            if (sequence.size() >= 2) {
                result.add(new ArrayList<>(sequence));
            }
            return;
        }
		
        if (sequence.size() >= 2) {
            result.add(new ArrayList<>(sequence));
        }
		
		for (int i = index; i < nums.length; i++) {
			if (sequence.size() == 0 || sequence.get(sequence.size() - 1) <= nums[i]) {
				sequence.add(nums[i]);
				backtrack(nums, i + 1, sequence, result);
				sequence.remove(sequence.size() - 1);
			}
		}
	}
	
	public List<List<Integer>> findSubsequences(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();
		List<Integer> sequence = new ArrayList<>();
		backtrack(nums, 0, sequence, result);
		return new ArrayList<>(result);
	}
}