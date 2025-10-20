// Last updated: 10/20/2025, 11:34:30 AM
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (nums[i] > 0) {
                list.add(nums[i] % 10);
                nums[i] /= 10;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(list.size() - i - 1);
        }
        return arr;
    }
}