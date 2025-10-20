// Last updated: 10/20/2025, 11:42:44 AM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        int flag = 0, vf, temp;
        for (int i = left; i <= right; i++) {
            flag = 0;
            temp = i;
            while (temp != 0) {
                vf = temp % 10;
                if (vf == 0 || i % vf != 0) {
                    flag = 1;
                    break;
                }
                temp /= 10;
            }
            if (flag == 0) list.add(i); 
        }
        return list;
    }
}