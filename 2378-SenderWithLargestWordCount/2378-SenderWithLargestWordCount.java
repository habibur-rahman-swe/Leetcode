// Last updated: 10/20/2025, 11:35:48 AM
class Solution {
    public String largestWordCount(String[] messeges, String[] senders) {
        TreeMap<String, Integer> tm = new TreeMap<>();
		
		for (int i = 0; i < messeges.length; i++) {
			tm.put(senders[i], tm.getOrDefault(senders[i], 0) + messeges[i].split(" ").length);
		}
		
		int max = 0;
		String res = null;
		
		for (String s : tm.keySet()) {
			if (tm.get(s) >= max) {
				max = tm.get(s);
				res = s;
			}
		}
		return res;
    }
}