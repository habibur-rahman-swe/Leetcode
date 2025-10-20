// Last updated: 10/20/2025, 11:37:46 AM
class Solution {
    public int countGoodRectangles(int[][] arr) {
        HashMap<Integer, Integer> hash_map = new HashMap<>();
        
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (!hash_map.containsKey(Math.min(arr[i][0],arr[i][1]))) {
                hash_map.put(Math.min(arr[i][0], arr[i][1]), 1);
            }
            else {
                int m = hash_map.get(Math.min(arr[i][0], arr[i][1]));
                hash_map.replace(Math.min(arr[i][0], arr[i][1]), m + 1);
            }
        }

        int ans = 0, temp = 0;
        
        for (Map.Entry<Integer, Integer> entry : hash_map.entrySet()) {
            int x = entry.getKey();
            if (x > temp) {
                temp = x;
                ans = entry.getValue();
            }
        }
        return ans;
    }
}