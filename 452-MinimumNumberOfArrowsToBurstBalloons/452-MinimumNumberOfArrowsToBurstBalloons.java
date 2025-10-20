// Last updated: 10/20/2025, 11:44:00 AM
class Solution {
    	public int findMinArrowShots(int[][] points) {
        int cnt = points.length;
        
        Pair[] pairs = toPairs(points);
        Arrays.sort(pairs, (a, b) -> a.x1 - b.x1);
        
        int left = pairs[0].x1, right = pairs[0].x2;
        
        for (int i = 1; i < pairs.length; i++) {
        	left = Math.max(left, pairs[i].x1);
        	right = Math.min(right, pairs[i].x2);
        	
        	if (left <= right) {
        		--cnt;
        	} else {
        		left = pairs[i].x1;
        		right = pairs[i].x2;
        	}
        }
        
        return cnt;
    }
	
	public Pair[] toPairs(int[][] points) {
		int n = points.length;
		Pair[] pairs = new Pair[n];
		for (int i = 0; i < n; i++) {
			pairs[i] = new Pair(points[i][0], points[i][1]);
		}
		return pairs;
	}
}

class Pair {
	int x1, x2;
	Pair() {
		
	}
	
	Pair(int x1, int x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
}