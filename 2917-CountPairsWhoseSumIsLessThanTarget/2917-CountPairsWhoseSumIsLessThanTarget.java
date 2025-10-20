// Last updated: 10/20/2025, 11:33:07 AM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    ++cnt;
                }
            }
        }
        return cnt;
    }
}