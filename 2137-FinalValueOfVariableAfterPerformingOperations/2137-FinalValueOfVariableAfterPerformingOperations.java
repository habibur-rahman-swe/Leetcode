// Last updated: 10/20/2025, 11:36:44 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        return findFinalValue(0, operations);
    }

    private int findFinalValue(int idx, String[] operations) {
        if (idx >= operations.length) {
            return 0;
        }

        return ((
                    operations[idx].charAt(0) == '+' ||
                    operations[idx].charAt(2) == '+'
                ) ? 1 : -1) + findFinalValue(idx + 1, operations);
    }
}