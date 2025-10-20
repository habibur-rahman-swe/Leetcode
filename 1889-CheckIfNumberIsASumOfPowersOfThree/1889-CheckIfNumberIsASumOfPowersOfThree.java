// Last updated: 10/20/2025, 11:37:30 AM
class Solution {
    public boolean checkPowersOfThree(int n) {
        int tempN = 1;
        Set<Integer> set = new HashSet<>();
        int pow = 0;

        while (n > 0) {    
            while (n >= tempN * 3) {
                tempN *= 3;
                ++pow;
            }
            if (set.contains(pow)) return false;
            
            set.add(pow);
            n -= tempN;
            tempN = 1;
            pow = 0;
        }
        
        return n == 0;
    }
}