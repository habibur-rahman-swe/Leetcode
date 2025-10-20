// Last updated: 10/20/2025, 11:38:51 AM
class Solution {
    public double average(int[] salary) {
        int max = 0, min = Integer.MAX_VALUE;
        
        double sum = 0;

        for (int sal : salary) {
            sum += sal;
            max = Math.max(max, sal);
            min = Math.min(min, sal);
        }

        return (sum - max - min) / (salary.length - 2);
    }
}