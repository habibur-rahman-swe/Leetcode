// Last updated: 10/20/2025, 11:32:15 AM
class Solution {
    public long minimumCost(int[] nums) {
        
        Arrays.sort(nums);
        
        int med = 0, len = nums.length;
        med = nums[len / 2];
        
        int num1 = med, num2 = med;
        while (!palindrom(num1)) --num1;
        while (!palindrom(num2)) ++num2;

        long sum1 = 0, sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 += Math.abs(num1 - nums[i]);
            sum2 += Math.abs(num2 - nums[i]);
        }

        return Math.min(sum1, sum2);
    }

    private boolean palindrom(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        return rev == num;
    }
}