// Last updated: 10/20/2025, 11:32:50 AM
class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);
        Collections.reverse(tasks);
        
        int max = 0;
        
        for (int i = 0; i < processorTime.size(); i++) {
            int sum = 0;
            for (int j = i * 4; j < (i + 1) * 4; j++) {
                sum = Math.max(tasks.get(j), sum);
            }
            // System.out.println(processorTime + "\n" + tasks);
            max = Math.max(max, sum + processorTime.get(i));
        }
        return max;
    }
}