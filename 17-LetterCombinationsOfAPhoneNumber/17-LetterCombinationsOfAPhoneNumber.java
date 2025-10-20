// Last updated: 10/20/2025, 11:48:56 AM
class Solution {
    List<String> list;
    HashMap<Character, String> hm;
    String digits;
    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();
        hm = new HashMap<>();
        this.digits = digits;
        
        if (digits.length() == 0) return list;
        
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        
        comb(0, "");
        
        return list;
    }
    
    public void comb(int i, String s) {
        if (i == digits.length()) {
            list.add(s);
            return;
        }
        
        for (char c : hm.get(digits.charAt(i)).toCharArray()) {
            String str = new String(s);
            str = str + c;
            comb(i+1, str);
        }
    }
}