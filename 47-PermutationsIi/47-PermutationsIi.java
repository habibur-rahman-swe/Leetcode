// Last updated: 10/20/2025, 11:48:12 AM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        
        List<Integer> list = new ArrayList<>();
        
        for (int x : nums) {
            list.add(x);
        }

        permute(result, list, 0, nums.length - 1);

        return new ArrayList<>(result);
    }

    private void permute(Set<List<Integer>> result, List<Integer> nums, int low, int high) {
        if (low == high) {
            result.add(new ArrayList<>(nums));
            return;
        }
        int temp;
        for (int i = low; i <= high; i++) {
            temp = nums.get(i);
            nums.set(i, nums.get(low));
            nums.set(low, temp);

            permute(result, nums, low + 1, high);

            temp = nums.get(i);
            nums.set(i, nums.get(low));
            nums.set(low, temp);
        }
    }
}