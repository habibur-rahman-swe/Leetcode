// Last updated: 10/20/2025, 11:36:39 AM
class Solution {
    public boolean areNumbersAscending(String s) {
        String ss[] = s.split(" ");
        
        int x = -1;
        
        for (String xx : ss) {
            if (xx.charAt(0) >= '1' && xx.charAt(0) <= '9') {
                if (Integer.parseInt(xx) > x) x = Integer.parseInt(xx);
                else return false;
            }
        }
        return true;
    }
}