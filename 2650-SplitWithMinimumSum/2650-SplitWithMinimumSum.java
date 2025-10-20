// Last updated: 10/20/2025, 11:34:22 AM
class Solution {
    public int splitNum(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        
        Collections.sort(list);
        
        int num1 = 0, num2 = 0;
        
        while (list.get(0) == 0) {
            list.remove(0);
        }
        
        for (int i = 0; i < list.size() + 2; i += 2) {
            if (i < list.size()) num1 = num1 * 10 + list.get(i);
            if (i + 1 < list.size()) num2 = num2 * 10 + list.get(i+1);
        }
        
        return num1 + num2;
    }
}