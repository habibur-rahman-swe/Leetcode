// Last updated: 10/20/2025, 11:36:51 AM
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums);
        Arrays.sort(nums, (a, b)-> a.length() - b.length());
        int n = nums.length;
        
        return nums[n - k];
    }
}