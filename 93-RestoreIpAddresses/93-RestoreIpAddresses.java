// Last updated: 10/20/2025, 11:47:11 AM
class Solution {
    public List<String> restoreIpAddresses(String s) {
        Set<String> result = new HashSet<>();
        backtrack(s, 0, new ArrayList<String>(), result);
        return new ArrayList<>(result);
    }

    private void backtrack(String s, int start, List<String> list, Set<String> result) {
        if (list.size() == 4) {
            int size = 0;
            for (String x : list) {
                size += x.length();
                if (Integer.parseInt(x) < 0 || Integer.parseInt(x) > 255) return;
                if (Integer.parseInt(x) != 0 && (x.charAt(0) == '0')) return;
                if (Integer.parseInt(x) == 0 && x.length() > 1) return;
            }
            if (size == s.length()) {
                result.add(list.get(0) + "." + list.get(1) + "." + list.get(2) + "." + list.get(3));
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i <= s.length()) {
                list.add(s.substring(start, start+i));
                backtrack(s, start + i, list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}