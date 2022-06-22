class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for (int x : nums) {
            priorityQueue.add(x);
            if (priorityQueue.size() > k) priorityQueue.poll();
        }
        if (priorityQueue.size() < k) return -1;
        return priorityQueue.peek();
    }
}