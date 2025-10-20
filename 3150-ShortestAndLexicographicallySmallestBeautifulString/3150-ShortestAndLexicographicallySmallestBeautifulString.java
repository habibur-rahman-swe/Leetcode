// Last updated: 10/20/2025, 11:32:52 AM
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0, cnt = 0; i < s.length(); i++) {
        	if (s.charAt(i) == '1') {
        		++cnt;
        	}
        	sb.append(s.charAt(i));
        	
        	if (cnt > k) {
        		while (sb.length() > 0 && cnt > k) {
        			if (sb.charAt(0) == '1') --cnt;
        			sb.deleteCharAt(0);
        		}
        	}
            
            while (sb.length() > 0 && sb.charAt(0) == '0') {
        		sb.deleteCharAt(0);
        	}
            
        	if (cnt == k) {
                StringBuilder tb = new StringBuilder(sb);
                while (tb.length() > 0 && tb.charAt(tb.length() - 1) == '0') {
                    tb.deleteCharAt(tb.length() - 1);
                }
                pq.add(new String(tb));
            }
        }
        
        List<String> list = new ArrayList<>(pq);
        Collections.sort(list, (a, b) -> a.compareTo(b) < 0 ? -1 : 1);
        Collections.sort(list, (a, b) -> a.length() - b.length());
        
        return pq.size() != 0 ? list.get(0) : "";
    }
}