// Last updated: 10/20/2025, 11:41:22 AM
class RecentCounter {
    int[] counter;
    int left, right;

    public RecentCounter() {
        counter = new int[10001];
        left = right = 0;    
    }
    
    public int ping(int t) {
        counter[right] = t;

        while (counter[right] - counter[left] > 3000) left++;
        right++;

        return right - left;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */