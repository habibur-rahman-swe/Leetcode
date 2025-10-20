// Last updated: 10/20/2025, 11:41:17 AM
class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean up = false;
        boolean down = false;
        
        int idx = 1;
        while (idx < arr.length) {
            if (arr[idx - 1] < arr[idx] && !down) {
                up = true;
            } else if (arr[idx - 1] > arr[idx] && up) {
                down = true;
            } else if (arr[idx - 1] < arr[idx] && down) {
                return false;
            } else if (arr[idx - 1] > arr[idx] && !up) {
                return false;
            } else {
                return false;
            }
            ++idx;
        }
        return (up & down);
    }
}