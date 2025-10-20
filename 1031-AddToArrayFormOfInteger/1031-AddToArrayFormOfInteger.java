// Last updated: 10/20/2025, 11:40:52 AM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = num.length - 1; i >= 0; i--) {
            k += num[i];
            list.add(k % 10);
            k /= 10;
        }

        while (k > 0) {
            list.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}