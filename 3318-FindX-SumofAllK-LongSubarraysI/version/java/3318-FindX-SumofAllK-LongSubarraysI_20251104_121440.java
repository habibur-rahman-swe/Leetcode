// Last updated: 11/4/2025, 12:14:40 PM
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] res = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length - k + 1; i++) {
            res[i] = findXSum(nums, i, k, x);
        }

        return res;
    }

    private int findXSum(int[] nums, int idx, int k, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = idx; i < idx + k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        if (map.size() <= x) {
            for (int key : map.keySet()) {
                sum += key * map.get(key);
            }
        } else {
            sum = xSum(map, x);
        }
        return sum;
    }
    private int xSum(HashMap<Integer, Integer> map, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1]; 
                else return b[0] - a[0];
            }
        );
        for (int key : map.keySet()) {
            pq.add(new int[]{key, map.get(key)});
        }

        int sum = 0;

        for (int i = 0; i < x; i++) {
            int[] pres = pq.poll();
            sum += pres[0] * pres[1];
        }
        
        return sum;
    }
}