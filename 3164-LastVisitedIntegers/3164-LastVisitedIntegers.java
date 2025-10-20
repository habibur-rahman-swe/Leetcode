// Last updated: 10/20/2025, 11:32:47 AM
class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> tList = new ArrayList<Integer>();
        List<Integer> res = new ArrayList<>();
        int cnt = 1;
        for (String x : words) {
            if (x.compareTo("prev") == 0) {
                if (tList.size() >= cnt) {
                    res.add(tList.get(tList.size() - cnt));
                } else {
                    res.add(-1);
                }
                ++cnt;
            } else {
                cnt = 1;
                tList.add(Integer.parseInt(x));
            }
        }
        return res;
    }
}