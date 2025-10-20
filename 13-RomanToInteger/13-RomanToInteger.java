// Last updated: 10/20/2025, 11:49:00 AM
class Solution {
    public int romanToInt(String s) {
        char[] sc = s.toCharArray();
        int sum = 0;
        for (int i = sc.length - 1; i >= 0; i--) {
            if (sc[i] == 'I') sum += (sum < 5 ? 1 : -1);
            else if (sc[i] == 'V') sum += 5;
            else if (sc[i] == 'X') sum += (sum < 50 ? 10 : -10);
            else if (sc[i] == 'L') sum += 50;
            else if (sc[i] == 'C') sum += (sum < 500 ? 100 : -100);
            else if (sc[i] == 'D') sum += 500;
            else if (sc[i] == 'M') sum += 1000;
        }

        return sum;
    }
}