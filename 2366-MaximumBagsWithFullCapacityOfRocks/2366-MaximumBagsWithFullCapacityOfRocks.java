// Last updated: 10/20/2025, 11:35:51 AM
class Solution {
    public int maximumBags(int[] a, int[] b, int additionalRocks) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> ((y.rocks - y.capacity) - (x.rocks - x.capacity)));
			
        for (int i = 0; i < a.length; i++) {
            pq.add(new Pair(a[i], b[i]));
        }
        
        int cnt = 0;
        
        while (!pq.isEmpty() && additionalRocks > 0) {
            Pair p = pq.poll();
            
            if (p.capacity - p.rocks > additionalRocks) break;
            
            additionalRocks -= (p.capacity - p.rocks);
            ++cnt;
        }

        return cnt;
    }
}

class Pair {
	int capacity;
	int rocks;
	
	Pair() {
		
	}
	
	Pair(int capacity, int rock) {
		this.capacity = capacity;
		this.rocks = rock;
	}
}