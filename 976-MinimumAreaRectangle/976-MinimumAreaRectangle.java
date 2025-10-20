// Last updated: 10/20/2025, 11:41:18 AM
class Solution {
    public int minAreaRect(int[][] points) {
    	Set<Integer> s = new HashSet<>();
    	for (int[] p : points) {
    		s.add(p[0] * 40001 + p[1]);
    	}
    	
    	int min = Integer.MAX_VALUE;
    	int l = points.length;
    	for (int i = 0; i < l; i++) {
    		int[] p1 = points[i];
    		for (int j = i + 1; j < l; j++) {
    			int[] p2 = points[j];
    			
    			if (p1[0] == p2[0] || p1[1] == p2[1]) continue;
    			int need1 = p1[0] * 40001 + p2[1];
    			int need2 = p2[0] * 40001 + p1[1];
    			
    			if (s.contains(need1) && s.contains(need2)) {
    				min = Math.min(min, Math.abs(p1[0] - p2[0]) * Math.abs(p1[1] - p2[1]));
    			}
    		}
    	}
    	return (min == Integer.MAX_VALUE ? 0 : min);
    }
}