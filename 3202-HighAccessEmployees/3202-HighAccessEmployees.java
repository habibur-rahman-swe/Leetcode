// Last updated: 10/20/2025, 11:32:24 AM
class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        HashSet<String> employee = new HashSet<>();
        for (List<String> at : access_times) {
            employee.add(at.get(0));
        }
        List<String> ans = new ArrayList<>();
        for (String e : employee) {
            if (has3Access(e, access_times)) {
                ans.add(e);
            }
        }
        return ans;
    }
    private  boolean  has3Access(String e, List<List<String>> access) {
        List<Integer> time = new ArrayList<>();
        for (List<String> ac : access)  {
            if  (ac.get(0).compareTo(e) == 0) {
                time.add(toTime(ac.get(1)));
            }
        }
        Collections.sort(time);
        int left  = 0,  right = 0;
        while (right < time.size()) {
            if (time.get(right) - time.get(left) < 60) ++right;
            else ++left;
            if (right - left == 3) return true;
        }
        return false;
    }
    private  int toTime(String s) {
       return (s.charAt(0) - '0') * 600 + (s.charAt(1) -  '0') * 60 + (s.charAt(2) - '0') * 10 + (s.charAt(3)  - '0');
    }
}