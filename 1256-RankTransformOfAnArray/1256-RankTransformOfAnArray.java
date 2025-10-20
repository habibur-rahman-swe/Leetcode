// Last updated: 10/20/2025, 11:40:16 AM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> numToRank = new HashMap<>();
        TreeSet<Integer> nums = new TreeSet<>();

        for (int num : arr) nums.add(num);

        int rank = 1;

        for (int num : nums) {
            numToRank.put(num, rank++);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = numToRank.get(arr[i]);
        }
        return arr;
    }
}