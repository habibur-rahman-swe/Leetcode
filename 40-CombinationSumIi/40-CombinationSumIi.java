// Last updated: 10/20/2025, 11:48:21 AM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int candidate : candidates) {
            counter.put(candidate, counter.getOrDefault(candidate, 0) + 1);
        }

        List<int[]> counterList = new ArrayList<>();
        counter.forEach((key, value) -> {
            counterList.add(new int[] {key, value});
        });

        backtrack(comb, target, 0, counterList, results);

        return results;
    }

    private void backtrack(LinkedList<Integer> comb, int remain, int curr, List<int[]> counter, List<List<Integer>> results) {
        if (remain <= 0) {
            if (remain == 0) {
                results.add(new ArrayList<Integer>(comb));
            }
            return;
        }

        for (int nextCurr = curr; nextCurr < counter.size(); ++nextCurr) {
            int[] entry = counter.get(nextCurr);
            Integer candidate = entry[0], freq = entry[1];

            if (freq <= 0) continue;

            comb.addLast(candidate);
            counter.set(nextCurr, new int[] {candidate, freq - 1});

            backtrack(comb, remain - candidate, nextCurr, counter, results);

            counter.set(nextCurr, new int[] {candidate, freq});
            comb.removeLast();
        }
    }
}