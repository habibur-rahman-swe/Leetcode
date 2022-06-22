class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int[] arr = new int[n];
        int e = (n-1)/2, o = n - 1;
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                arr[i] = nums[e];
                e--;
            } else {
                arr[i] = nums[o];
                o--;
            }
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}