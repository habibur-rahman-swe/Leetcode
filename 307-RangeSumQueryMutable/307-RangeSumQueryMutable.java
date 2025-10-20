// Last updated: 10/20/2025, 11:44:51 AM
class NumArray {
    private int[] nums;
    private int len;
    private int[] b;
    
    public NumArray(int[] nums) {
        this.nums = nums;
        
        len = (int)Math.ceil(Math.sqrt(nums.length));
        b = new int[len];
        
        for (int i = 0; i < nums.length; i++) {
            b[i/len] += nums[i];
        }
    }
    
    public void update(int index, int val) {
        int b_idx = index / len;
        b[b_idx] = b[b_idx] + val - nums[index];
        nums[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int firstBlock = left / len;
        int lastBlock = right / len;
        
        int sum = 0;
        if (firstBlock == lastBlock) {
            for (int i = left; i <= right; i++) {
                sum += nums[i];
            }
        } else {
            for (int i = left; i < (firstBlock + 1) * len; i++) {
                sum += nums[i];
            }
            for (int i = firstBlock + 1; i < lastBlock; i++) {
                sum += b[i];
            }
            for (int i = lastBlock * len; i <= right; i++) {
                sum += nums[i];
            }
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */