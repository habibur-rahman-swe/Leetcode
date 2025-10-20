// Last updated: 10/20/2025, 11:48:23 AM
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        getRes(candidates, 0, target, new ArrayList<Integer>(), 0);
        return res;
    }
    
    public void getRes(int[] candidates, int sum, int target, List<Integer> prev, int idx) {
        if (sum > target) return;
        
        if (sum == target) {
            res.add(prev);
            return;
        }
        
        for (int i = idx; i < candidates.length; i++) {
            List<Integer> pres = new ArrayList<>(prev);
            pres.add(candidates[i]);
            getRes(candidates, sum + candidates[i], target, pres, i);
        }
    }
}