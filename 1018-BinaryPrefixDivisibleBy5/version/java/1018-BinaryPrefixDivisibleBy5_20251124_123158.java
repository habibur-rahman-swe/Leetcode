// Last updated: 11/24/2025, 12:31:58 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        long mul = 0;
        for (int num : nums) {
            mul = mul * 2 + num;
            mul %= 5;
            res.add(mul == 0);
        }
        return res;
    }
}