// Last updated: 10/20/2025, 11:46:42 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        List<Integer> list;
        
        for (int i = 0; i < numRows; i++) {
            list = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            
            res.add(list);
        }
        
        return res;
    }
}