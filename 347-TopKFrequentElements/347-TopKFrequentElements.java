// Last updated: 10/20/2025, 11:44:38 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y)->hm.get(x) - hm.get(y));
        
        for (int x : hm.keySet()) {
            pq.add(x);
            if (pq.size() > k) pq.poll();
        }
        
        int arr[] = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            arr[i] = pq.peek();
            pq.poll();
        }
        return arr;
    }
}