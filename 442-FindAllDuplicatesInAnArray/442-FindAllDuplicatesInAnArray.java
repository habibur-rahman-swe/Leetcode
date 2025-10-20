// Last updated: 10/20/2025, 11:44:05 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] has = new boolean[nums.length + 1];
        for (int num : nums) {
            if (has[num]) {
                list.add(num);
            }
            has[num] = true;
        }
        return list;
    }
}