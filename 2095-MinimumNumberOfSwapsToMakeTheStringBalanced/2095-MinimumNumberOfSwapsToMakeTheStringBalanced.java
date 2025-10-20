// Last updated: 10/20/2025, 11:36:55 AM
class Solution {
    public int minSwaps(String s) {
        int stackSize = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                ++stackSize;
            } else {
                if (stackSize > 0) --stackSize;
            }
        }
        return (stackSize + 1) / 2;
    }
}