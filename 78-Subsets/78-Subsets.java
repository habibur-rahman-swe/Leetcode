// Last updated: 10/20/2025, 11:47:29 AM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int x : nums) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                List<Integer> list = new ArrayList(res.get(i));
                list.add(x);
                res.add(list);
            }
        }
        return res;
    }
}