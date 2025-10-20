// Last updated: 10/20/2025, 11:36:54 AM
class Solution {
public:
    int findGCD(vector<int>& nums) {
        int small = nums[0];
        int big = nums[0];
        for (auto x : nums) {
            if (x > big) big = x;
            if (x < small) small = x;
        }
        return __gcd(big, small);
    }
};