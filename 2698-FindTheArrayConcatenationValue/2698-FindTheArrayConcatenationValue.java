// Last updated: 10/20/2025, 11:34:03 AM
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            if (left == right) {
                sum += nums[left];
            } else {
                String str = String.valueOf(nums[left]) + String.valueOf(nums[right]);
                sum += Long.parseLong(str);
            }
            left++;
            right--;
        }
        return sum;
    }
}