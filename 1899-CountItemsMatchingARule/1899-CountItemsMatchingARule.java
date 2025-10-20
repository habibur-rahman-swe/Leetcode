// Last updated: 10/20/2025, 11:37:26 AM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        List<String> s = new ArrayList<String>();
        int index;
        if (ruleKey.equals("type")) index = 0;
        else if (ruleKey.equals("color")) index = 1;
        else index = 2;
        int ans = 0;
        for (int i = 0; i < items.size(); i++) {
            s = new ArrayList<String>(items.get(i));
            String ss = s.get(index);
            if (ss.equals(ruleValue)) ++ans;
        }
        return ans;
    }
}