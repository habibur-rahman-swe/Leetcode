// Last updated: 10/20/2025, 11:47:45 AM
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 1, temp;
        for (int i = digits.length - 1; i >= 0; i--) {
            temp = carry + digits[i];
            res.add(0,temp%10);
            carry = temp / 10;
        }
        if (carry != 0) res.add(0, carry);
        int[] arr = new int[res.size()];
        int j = 0;
        for (int x : res) arr[j++] = x;
        return arr;
    }
}