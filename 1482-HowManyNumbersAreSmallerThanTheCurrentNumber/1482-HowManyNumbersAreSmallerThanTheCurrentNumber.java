// Last updated: 10/20/2025, 11:39:22 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int temp = 0;
        for (int i = 0; i < len; i++) {
            temp = 0;
            for (int j = 0; j < len; j++) {
                if (nums[j] < nums[i]) ++temp;
            }
            res[i] = temp;
        }
        return res;
    }
}