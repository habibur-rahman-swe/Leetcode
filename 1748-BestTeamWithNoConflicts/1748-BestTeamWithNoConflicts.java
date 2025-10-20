// Last updated: 10/20/2025, 11:38:12 AM
class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        Pair[] pairs = new Pair[scores.length];
        int[] dp = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            pairs[i] = new Pair(scores[i], ages[i]);
        }

        Arrays.sort(pairs, (a, b)-> (a.age == b.age ? a.score - b.score : a.age - b.age));
        for (int i = 0; i < pairs.length; i++) {
            dp[i] = pairs[i].score;
            for (int j = 0; j < i; j++) {
                if (pairs[i].age == pairs[j].age || pairs[j].score <= pairs[i].score && pairs[j].age < pairs[i].age) {
                    dp[i] = Math.max(dp[j] + pairs[i].score, dp[i]);
                }
            }
        }

        int ans = 0;
        for (int x : dp) {
            ans = Math.max(x, ans);
        }
        return ans;
    }
}

class Pair {
    int score;
    int age;

    Pair() {}
    Pair(int score, int age) {
        this.score = score;
        this.age = age;
    }
}