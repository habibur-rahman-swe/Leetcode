// Last updated: 10/20/2025, 11:44:02 AM
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a, b)->(a.cnt - b.cnt));
    	
    	TreeMap<Character, Integer> tm = new TreeMap<>();
    	
    	for (char c : s.toCharArray()) {
    		tm.put(c, tm.getOrDefault(c, 0) + 1);
    	}
    	
    	for (char c : tm.keySet()) {
    		pq.add(new Pair(c, tm.get(c)));
    	}
    	
    	StringBuilder sb = new StringBuilder("");
    	
    	while (pq.size() > 0) {
    		Pair p = pq.poll();
    		
    		int cnt = p.cnt;
    		char c = p.c;
    		
    		while (cnt-- > 0) {
    			sb.append(c);
    		}
    	}
    	
        return new String(sb.reverse());
    }
}

class Pair {
    char c;
    int cnt;
    Pair(){}
    Pair(char c, int cnt) {
        this.c = c;
        this.cnt = cnt;
    }
}