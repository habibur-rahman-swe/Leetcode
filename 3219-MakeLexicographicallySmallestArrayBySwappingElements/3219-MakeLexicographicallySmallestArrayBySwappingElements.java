// Last updated: 10/20/2025, 11:32:19 AM
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);

        int group = 0;
        HashMap<Integer, Integer> numsGroup = new HashMap<>();
        HashMap<Integer, LinkedList<Integer>> groupNums = new HashMap<>();

        numsGroup.put(sortedArray[0], group);
        groupNums.put(group, new LinkedList<>());
        groupNums.get(0).add(sortedArray[0]);

        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] - sortedArray[i-1] > limit) {
                group++;
                groupNums.put(group, new LinkedList<>());
            }
            groupNums.get(group).add(sortedArray[i]);
            numsGroup.put(sortedArray[i], group);
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = groupNums.get(numsGroup.get(nums[i])).pop();
        }

        return nums;
    }
}