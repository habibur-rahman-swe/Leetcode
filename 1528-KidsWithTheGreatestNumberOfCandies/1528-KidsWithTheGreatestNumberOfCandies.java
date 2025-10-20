// Last updated: 10/20/2025, 11:39:10 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int x : candies) {
            if (x > max) max = x;
        }
        List<Boolean> list = new ArrayList<>();
        for (int x : candies) {
            if (x + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}