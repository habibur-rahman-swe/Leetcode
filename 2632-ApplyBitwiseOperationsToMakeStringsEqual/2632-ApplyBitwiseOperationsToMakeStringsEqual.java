// Last updated: 10/20/2025, 11:34:35 AM
class Solution {
    public boolean makeStringsEqual(String s, String target) {
        if (!target.contains("1") && s.compareTo(target) != 0 || !s.contains("1") && s.compareTo(target) != 0 ) return false;
        else return true;
    }
}