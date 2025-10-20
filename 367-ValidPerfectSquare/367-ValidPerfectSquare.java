// Last updated: 10/20/2025, 11:44:33 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        int x = (int)Math.sqrt(num);
        
        if (x*x == num) return true;
        else return false;
    }
}