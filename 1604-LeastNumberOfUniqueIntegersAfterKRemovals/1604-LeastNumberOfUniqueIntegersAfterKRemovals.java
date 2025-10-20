// Last updated: 10/20/2025, 11:38:47 AM
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int x : arr) {
            tm.put(x, tm.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> tm.get(a) - tm.get(b));

        for (int key : tm.keySet()) {
            pq.offer(key);
        }

        while (k > 0) {
            int x = pq.poll();
            int min = Math.min(tm.get(x), k);
            if (tm.get(x) <= k) tm.remove(x);
            else pq.offer(x);
            k -= min;
        }

        return pq.size();
    }
}