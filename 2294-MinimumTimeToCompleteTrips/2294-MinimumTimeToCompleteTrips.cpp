// Last updated: 10/20/2025, 11:36:17 AM
class Solution {
public:
    long long minimumTime(vector<int>& time, int totalTrips) {
        long long ans = 100000000000000;
        long long l = 0, r = 100000000000001;
        while (l < r) {
            long long mid = l + (r - l) / 2;
            long long cnt = 0;
            
            for (int x : time) {
                cnt += (mid / x);
            }
            
            if (cnt >= totalTrips) {
                ans = min(ans, mid);
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
};