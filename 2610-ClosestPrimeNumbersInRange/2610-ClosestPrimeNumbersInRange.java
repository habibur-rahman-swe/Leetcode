// Last updated: 10/20/2025, 11:34:45 AM
class Solution {
    public int[] closestPrimes(int left, int right) {
        int prevPrime = -1, closestA = -1, closestB = -1;
        int minDifference = Integer.MAX_VALUE;

        for (int candidate = left; candidate <= right; candidate++) {
            if (isPrime(candidate)) {
                if (prevPrime != -1) {
                    int difference = candidate - prevPrime;
                    if (difference < minDifference) {
                        minDifference = difference;
                        closestA = prevPrime;
                        closestB = candidate;
                    }

                    if (difference == 2 || difference == 1) {
                        return new int[] {prevPrime, candidate};
                    }
                }
                prevPrime = candidate;
            }
        }
        return (closestA == -1) ? new int[] {-1, -1} : new int[] {closestA, closestB};
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0) return false;

        for (int divisor = 3; divisor * divisor <= number; divisor += 2) {
            if (number % divisor == 0) return false;
        }
        return true;
    }
}