// Last updated: 10/20/2025, 11:47:15 AM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<Integer>(), result);
        return new ArrayList<>(result);
    }

    private void backtrack(int idx, int[] nums, List<Integer> list, Set<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        backtrack(idx+1, nums, list, result);
        list.remove(list.size() - 1);
        backtrack(idx+1, nums, list, result);
    }
}