// Last updated: 10/20/2025, 11:46:40 AM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        for (int i = 0; i <= rowIndex; i++) {
            l2 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) l2.add(1);
                else l2.add(l1.get(j)+l1.get(j-1));
            }
            l1 = new ArrayList<>(l2);
        }
        return l1;
    }
}