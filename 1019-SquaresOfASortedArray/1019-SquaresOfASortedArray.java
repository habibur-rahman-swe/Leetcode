// Last updated: 10/20/2025, 11:40:58 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        
        mergeSort(nums, 0, n-1);
        
        return nums;
    }
    
    void merge(int arr[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        
        int L[] = new int[n1];
        int M[] = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i] = arr[p+i];
        }
        
        for (int j = 0; j < n2; j++) {
            M[j] = arr[q+1+j];
        }
        
        
        int i = 0, j = 0, k = p;
        
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            j++;
            k++;
        }
    }
    
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            
            merge(arr, l, m, r);
        }
    }
}