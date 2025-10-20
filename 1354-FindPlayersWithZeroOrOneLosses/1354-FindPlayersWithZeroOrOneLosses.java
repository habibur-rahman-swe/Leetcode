// Last updated: 10/20/2025, 11:39:50 AM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];

        for (int[] match : matches) {
            int win = match[0];
            int los = match[1];

            if (losses[win] == 0) {
                losses[win] = -1;
            }

            if (losses[los] == -1) {
                losses[los] = 1;
            } else {
                losses[los]++;
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int i = 0; i < losses.length; i++) {
            if (losses[i] == -1) {
                zeroLoss.add(i);
            } else if (losses[i] == 1) {
                oneLoss.add(i);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }
}