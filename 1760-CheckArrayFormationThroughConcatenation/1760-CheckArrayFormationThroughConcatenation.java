// Last updated: 10/20/2025, 11:38:10 AM
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int total_pieces = 0;
        for (int i = 0; i < pieces.length; i++) {
            int index = -1;
            int[] a = arr;
            int[] b = pieces[i];
    
            for (int j = 0; j < a.length; j++) {
                if (b[0] == a[j]) {
                    index = j;
                    break;
                }
            }
            if (index < 0) return false;
            for (int j = index,k = 0; j < arr.length && k < b.length; j++, k++) {
                if (b[k] == a[j]){
                    ++total_pieces;
                }
                else {
                    return false;
                }
            }
        }
        if (total_pieces == arr.length)return true;
        else return false;
    }
}