class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd = numsDivide[0];
        for (int x : numsDivide) {
        	gcd = gcd(gcd, x);
        }
        
        Arrays.sort(nums);
        int i = 0;
        
        int n = nums.length;
        
        while (i < n && gcd % nums[i] != 0) i++;
        return i == n ? -1 : i;
    }
    
	public int gcd (int a, int b) {
		return (a%b==0?b:gcd(b, a%b));
	}
}