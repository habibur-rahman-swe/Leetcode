// Last updated: 10/20/2025, 11:35:13 AM
class Solution {
    public int minimizeXor(int num1, int num2) {
        int cnt = 0;
        while (num2 > 0) {
            cnt += num2 % 2;
            num2 /= 2;
        } 
        int[] arr = new int[33];
        for (int i = 32; i >= 0; i--) {
            arr[i] = num1 % 2;
            num1 /= 2;
        }

        int ans = 0;
        for (int x : arr) {
            ans *= 2;
            if (x == 1 && cnt > 0) {
                ans += 1;
                cnt--;
            }
        }
        
        char[] binary = Integer.toBinaryString(ans).toCharArray();
        int idx = binary.length - 1;

        while (idx >= 0 && cnt > 0) {
            if (binary[idx] == '0') {
                binary[idx] = '1';
                --cnt;
            }
            idx--;
        }
        String value = String.valueOf(binary);

        while (cnt > 0) {
            value = "1" + value;
            cnt--;
        }
        return Integer.parseInt(value, 2);
    }
}