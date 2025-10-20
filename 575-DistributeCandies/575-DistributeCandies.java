// Last updated: 10/20/2025, 11:43:34 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>hash_set = new HashSet<>();
        int n = candyType.length / 2;
        for (int x : candyType) hash_set.add(x);
        int s = hash_set.size();
        if (s <= n) return s;
        else return n;
    }
}