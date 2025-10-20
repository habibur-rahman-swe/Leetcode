// Last updated: 10/20/2025, 11:34:48 AM
class Solution {
    public boolean isPossible(int n, List<List<Integer>> edges) {
    	List<Set<Integer>> graph = new ArrayList<>();
    	List<Integer> odds = new ArrayList<>();
    	for (int i = 1; i <= n; i++) {
    		graph.add(new HashSet<>());
    	}
    	
    	for (List<Integer> edge : edges) {
    		int x = edge.get(0) - 1;
    		int y = edge.get(1) - 1;
    		graph.get(x).add(y);
    		graph.get(y).add(x);
    	}
    	
    	int cntOdd = 0;
    	for (int i = 0; i < n; i++) {
    		if (graph.get(i).size() % 2 == 1) {
    			++cntOdd;
    			odds.add(i);
    		}
    	}
    	
    	if (cntOdd == 0) {
    		return true;
    	} else if (cntOdd == 2) {
    		Integer u = odds.get(0), v = odds.get(1);
    		for (int k = 0; k < n; k++) {
    			if (!graph.get(k).contains(u) && !graph.get(k).contains(v)) {
    				return true;
    			}
    		}
    	} else if (cntOdd == 4) {
    		int a = odds.get(0), b = odds.get(1), c = odds.get(2), d = odds.get(3);
    		if ((!graph.get(a).contains(b) && !graph.get(c).contains(d)) || 
    			(!graph.get(b).contains(c) && !graph.get(a).contains(d)) ||
    			(!graph.get(a).contains(c) && !graph.get(b).contains(d))) {
    			return true;
    		}
    	} 
    	return false;
    }
}