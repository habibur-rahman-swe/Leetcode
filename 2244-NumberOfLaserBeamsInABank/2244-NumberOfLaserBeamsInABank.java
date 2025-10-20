// Last updated: 10/20/2025, 11:36:26 AM
class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        for (String b : bank) {
            int cnt = 0;
            for (char c : b.toCharArray()) {
                cnt += c - '0';
            }
            if (cnt > 0) list.add(cnt);
        }

        int ans = 0;
        for (int i = 1; i < list.size(); i++) {
            ans += list.get(i-1) * list.get(i);
        }
        return ans;
    }
}