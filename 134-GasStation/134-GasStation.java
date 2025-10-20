// Last updated: 10/20/2025, 11:46:24 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
		int gasInTank = 0;
		
		for (int i = 0; i < n; i++) {
			gasInTank += gas[i] - cost[i];
		}
		
		if (gasInTank < 0) return -1;
		
		int start = 0;
		gasInTank = 0;
		
		for (int i = 0; i < n; i++) {
			gasInTank += gas[i] - cost[i];
			
			if (gasInTank < 0) {
				start = i + 1;
				gasInTank = 0;
			}
		}
		return start % n;
    }
}