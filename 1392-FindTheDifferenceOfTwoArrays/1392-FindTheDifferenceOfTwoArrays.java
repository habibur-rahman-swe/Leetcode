// Last updated: 10/20/2025, 11:39:42 AM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(findAtoB(nums2, nums1));
        result.add(findAtoB(nums1, nums2));
        
        return result;
    }

    private List<Integer> findAtoB(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        boolean[] has = new boolean[2001];
        for (int x : a) {
            has[1000 + x] = true;
        }

        for (int x : b) {
            if (!has[1000 + x]) {
                set.add(x);
            }
        }
        return new ArrayList<>(set);
    }
}