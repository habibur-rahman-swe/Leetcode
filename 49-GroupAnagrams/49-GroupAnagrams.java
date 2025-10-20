// Last updated: 10/20/2025, 11:48:09 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for (String s : strs) {
            char[] x = s.toCharArray();
            Arrays.sort(x);
            String y = String.valueOf(x);

            List<String> list = hmap.getOrDefault(y, new ArrayList<>());
            list.add(s);
            hmap.put(y, list);
        }
        
        List<List<String>> res = new ArrayList<>();
        
        for (String s : hmap.keySet()) {
            res.add(hmap.get(s));
        }
        
        return res;
    }
}