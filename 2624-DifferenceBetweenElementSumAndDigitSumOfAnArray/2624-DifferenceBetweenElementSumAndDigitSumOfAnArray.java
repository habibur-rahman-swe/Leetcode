// Last updated: 10/20/2025, 11:34:40 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digSum = 0;
        
        for (int x : nums) {
            eleSum += x;
            while (x > 0) {
                digSum += x % 10;
                x /= 10;
            }
        }
        
        return Math.abs(eleSum - digSum);
    }
}