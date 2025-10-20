// Last updated: 10/20/2025, 11:47:33 AM
class Solution {
    public void sortColors(int[] nums) {
        int[] output = new int[nums.length];
        int[] count = new int[10];
        
        for (int x : nums) count[x]++;
        
        for (int i = 1; i < count.length; i++) count[i] += count[i-1];
        
        for (int i = nums.length - 1; i >= 0; i--) {
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = output[i];
        }
    }
}