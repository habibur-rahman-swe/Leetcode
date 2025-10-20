// Last updated: 10/20/2025, 11:45:26 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) return true;
        }
        
        return false;
    }
}