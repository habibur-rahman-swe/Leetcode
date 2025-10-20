// Last updated: 10/20/2025, 11:42:07 AM
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> res = new ArrayList<>();
		
		if (graph.length == 0 || graph[0].length == 0) {
			return res;
		}
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		dfs(graph, res, list, 0);
		
		return res;
	}
	
	
	private void dfs(int[][] graph, List<List<Integer>> res, List<Integer> list, int pos) {
		if (pos == graph.length - 1) {
			res.add(new ArrayList<>(list));
		} else {
			for (int x : graph[pos]) {
				list.add(x);
				dfs(graph, res, list, x);
				list.remove(list.size() - 1);
			}
		}
	}
}