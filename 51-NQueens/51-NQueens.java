// Last updated: 10/20/2025, 11:48:06 AM
class Solution {
    List<List<Integer>> result;
    boolean[] cols, rightDiagonal, leftDiagonal;
    
    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        cols = new boolean[n];
        rightDiagonal = new boolean[2*n];
        leftDiagonal = new boolean[2*n];
        
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) temp.add(0);
        
        solveNQUtil(result, n, 0, temp);
        
        List<List<String>> ans = new ArrayList<>();
        for (List<Integer> list : result) {
            List<String> str = new ArrayList<>();
            
            for (int y : list) {
                String s = "";
                for (int i = 0; i < n; i++) {
                    if (i == y-1) s = s + "Q";
                    else s = s + ".";
                }
                str.add(s);
            }
            ans.add(str);
        }
        return ans;
    }
    
    public void solveNQUtil(List<List<Integer>> result, int n, int row, List<Integer> comb) {
        if (n == row) {
            result.add(new ArrayList<>(comb));
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (cols[col] || leftDiagonal[row+col] || rightDiagonal[row-col+n]) continue;
            comb.set(col, row+1);
            cols[col] = leftDiagonal[row+col] = rightDiagonal[row-col+n] = true;
            solveNQUtil(result, n, row + 1, comb);
            cols[col] = leftDiagonal[row+col] = rightDiagonal[row-col+n] = false;
        }
    }
}