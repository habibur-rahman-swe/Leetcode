// Last updated: 10/20/2025, 11:47:31 AM
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list;
        
        for (int i = 1; i <= n; i++) {
            list = new ArrayList<>();
            list.add(i);
            getComb(list, i + 1, k, n);
        }
            
        return ans;
    }
    
    public void getComb(List<Integer> l, int x, int k, int  n) {
        if (l.size() == k) {
            ans.add(l);
            return;
        }
        for (int i = x; i <= n; i++) {
            List<Integer> list = new ArrayList<>(l);
            list.add(i);
            getComb(list, i+1, k, n);
        }
    }
}