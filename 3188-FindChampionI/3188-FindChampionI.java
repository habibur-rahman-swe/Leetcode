// Last updated: 10/20/2025, 11:32:31 AM
class Solution {
    public int findChampion(int[][] grid) {
        HashMap<Integer, Integer>  hm  = new HashMap<>();
        for(int i = 0; i < grid.length;  i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) hm.put(i, hm.getOrDefault(i,  0) + 1);
                else hm.put(j, hm.getOrDefault(j, 0) + 1);
            }
        }
        int max = 0, idx = 0;
        for  (int i  = 0; i < grid.length; i++) {
            if (hm.get(i) > max) {
                max  =  hm.get(i);
                idx  = i;
            }
        }
        return idx;
    }
}