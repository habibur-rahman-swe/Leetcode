// Last updated: 10/20/2025, 11:39:29 AM
class Solution {
    public int maximum69Number (int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < '9') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}