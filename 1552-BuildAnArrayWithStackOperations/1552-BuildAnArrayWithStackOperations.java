// Last updated: 10/20/2025, 11:39:03 AM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1, idx = 0; i <= n; i++) {
            list.add("Push");
            if (target.length > idx && target[idx] == i) {
                idx++;
                if (idx == target.length) break;
                continue;
            }
            list.add("Pop");
        }

        return list;
    }
}