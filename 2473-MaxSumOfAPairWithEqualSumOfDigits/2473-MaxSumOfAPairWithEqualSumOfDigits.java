// Last updated: 10/20/2025, 11:35:17 AM
class Solution {
    public int maximumSum(int[] nums) {
		int mx = -1;
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
		
		ArrayList<Integer> list;
		
		for (int x : nums) {
			int dSum = digitSum(x);
			
			if (hm.containsKey(dSum)) {
				list = hm.get(dSum);
			} else {
				list = new ArrayList<>();
			}
			
			list.add(x);
			hm.put(dSum, list);
		}
		
		for (int x : hm.keySet()) {
			list = hm.get(x);
			
			if (list.size() > 1) {
				Collections.sort(list);
				mx = Math.max(mx, list.get(list.size()-1) + list.get(list.size()-2));
			}
		}
		
		return mx;
	}
	
	public int digitSum(int x) {
		int sum = 0;
		
		while (x > 0) {
			sum += x % 10;
			x /= 10;
		}
		
		return sum;
	}
}