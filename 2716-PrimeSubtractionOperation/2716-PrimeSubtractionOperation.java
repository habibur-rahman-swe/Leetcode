// Last updated: 10/20/2025, 11:33:55 AM
class Solution {
    public boolean primeSubOperation(int[] nums) {
        
        List<Integer> primes = getPrimes();

        for (int i = 0; i < nums.length; i++) {
            int idx = 0;
            
            while (idx < primes.size() && ((i == 0 && nums[i] - primes.get(idx) > 0) ||
            (i != 0 && nums[i-1] < nums[i] - primes.get(idx)))) {
                idx++;
            }
           
            if (idx > 0) nums[i] -= primes.get(idx - 1);
            if (i > 0 && nums[i-1] >= nums[i]) return false;
        }

        return true;
    }

    private List<Integer> getPrimes() {
        boolean[] primes = new boolean[1001];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        List<Integer> list = new ArrayList<>();
        list.add(0);

        for (int i = 2; i * i <= 1000; i++) {
            for (int j = i * 2; j <= 1000; j += i) {
                primes[j] = false;
            }
        }
        for (int i = 0; i <= 1000; i++) {
            if (primes[i]) list.add(i);
        }
        return list;
    }
}