// Last updated: 10/20/2025, 11:40:23 AM
class Solution {
    public String defangIPaddr(String address) {
        String s = "";
        for (char c : address.toCharArray()) {
            s += (c == '.' ? "[.]" : c);
        }
        return s;
    }
}