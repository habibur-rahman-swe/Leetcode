// Last updated: 10/20/2025, 11:46:39 AM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size() - 2;
        List<Integer> list = new ArrayList<>();
        for (int i = n; i >= 0; i--) {
            list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(j, triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
            triangle.add(i, list);
        }
        return triangle.get(0).get(0);
    }
}