// Last updated: 10/20/2025, 11:34:25 AM
class Solution {
    private List<Integer> getPrimeFactors(int num) {
        List<Integer> primeFactors = new ArrayList<>();
        int x = 2;
        while (x * x <= num) {
            if (num % x == 0) {
                primeFactors.add(x);
                while (num % x == 0) num /= x;
            }
            x++;
        }
        if (num != 1) primeFactors.add(num);
        return primeFactors;
    }

    public int findValidSplit(int[] nums) {
        HashMap<Integer, Integer> right = new HashMap<>(), left = new HashMap<>();

        for (int num : nums) {
            for (int factor : getPrimeFactors(num)) {
                right.put(factor, right.getOrDefault(factor, 0) + 1);
            }
        }

        for (int i = 0, common = 0; i < nums.length - 1; i++) {
            for (int factor : getPrimeFactors(nums[i])) {
                left.put(factor, left.getOrDefault(factor, 0) + 1);
                if (left.get(factor) == 1) ++common;
                if (left.get(factor).equals(right.get(factor))) --common;
            }
            if (common == 0) return i;
        }
        return -1;
    }
}