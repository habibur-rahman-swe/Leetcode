// Last updated: 10/20/2025, 11:42:56 AM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int closest = binarySearch(arr, k, x);
        int low = closest, high = closest;
        
        while (high - low + 1 < k && high < arr.length - 1 && low > 0) {
            if (Math.abs(arr[low - 1] - x) <= Math.abs(arr[high + 1] - x)) {
                low--;
            } else {
                high++;
            }
        }
        
        while (high - low + 1 < k) {
            if (low > 0) low--;
            else high++;
        }
        List<Integer> ans = new ArrayList<>();
        while (low <= high) {
            ans.add(arr[low]);
            low++;
        }
        return ans;
    }
    public int binarySearch(int[] arr, int k, int x) {
        int low = 0, high = arr.length - 1, minDiff = Integer.MAX_VALUE, closest = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cand = arr[mid];
            if (Math.abs(cand - x) < minDiff) {
                minDiff = Math.abs(cand - x);
                closest = mid;
            }
            if (cand == x) return mid;
            else if (cand < x) low = mid + 1;
            else high = mid - 1;
        }
        return closest;
    }
}