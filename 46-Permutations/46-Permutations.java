// Last updated: 10/20/2025, 11:48:13 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int x : nums) list.add(x);
        
        List<List<Integer>> result = new ArrayList<>();
        
        permute(result, list, 0, nums.length - 1);

        return result;
    }

    private void permute(List<List<Integer>> result, List<Integer> nums, int low, int high) {
        if (low == high) {
            result.add(new ArrayList<>(nums));
            return;
        }

        for (int i = low; i <= high; i++) {
            int temp = nums.get(i);
            nums.set(i, nums.get(low));
            nums.set(low, temp);

            permute(result, nums, low + 1, high);

            temp = nums.get(i);
            nums.set(i, nums.get(low));
            nums.set(low, temp);
        }
    }
}