// Last updated: 10/20/2025, 11:48:58 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> el = new ArrayList<>();

        if (nums == null || nums.length < 3) return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i-1>0 && nums[i]==nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    el = new ArrayList<>();
                    el.add(nums[i]);
                    el.add(nums[left]);
                    el.add(nums[right]);
                    Collections.sort(el);
                    if (!result.contains(el)) result.add(el);
                    while (left + 1 < right && nums[left] == nums[left+1])++left;
                    while (right - 1 > left && nums[right] == nums[right-1])right--;
                    left++;
                    right--;   
                } 
                else if (sum < 0) left++;
                else right--;
            }
        }


        return result;
    }
}