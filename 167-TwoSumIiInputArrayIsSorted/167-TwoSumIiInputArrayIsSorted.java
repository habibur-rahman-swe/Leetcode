// Last updated: 10/20/2025, 11:46:03 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        
        int l = 0, r = numbers.length-1;
        
        while (l < r) {
            if (numbers[l]+numbers[r] == target) {
                arr[0] = l+1;
                arr[1] = r+1;
                break;
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        
        return arr;
    }
}