// Last updated: 10/20/2025, 11:42:46 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        
        int pres = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) pres += nums[i-1];
            if (2 * pres == sum - nums[i]) return i;
        }
        return -1;
    }
}