class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        for (int i = 0; i < s.length(); i++) {
            String pref = s.substring(0, i+1);
            String suff = s.substring(i+1);
            
            if (isPalindrom(pref)) {
                List<String> list = new ArrayList<>();
                list.add(pref);
                solve(suff, list);
            }
        }
        return result;
    }
    
    public void solve(String s, List<String> list) {
        if (s.length() == 0) {
            result.add(list);
            return;
        }
        
        for (int i = 0; i < s.length(); i++) {
            String pref = s.substring(0, i+1);
            String suff = s.substring(i+1);
            
            if (isPalindrom(pref)) {
                List<String> temp = new ArrayList<>(list);
                temp.add(pref);
                solve(suff, temp);
            }
        }
    }
    
    public boolean isPalindrom(String s) {
        int l = 0, r = s.length()-1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}