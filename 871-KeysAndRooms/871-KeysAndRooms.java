// Last updated: 10/20/2025, 11:41:55 AM
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Arrays.fill(visited, false);

        Queue<Integer> pq = new LinkedList<>();
        pq.add(0);
        visited[0] = true;

        while (!pq.isEmpty()) {
            int x = pq.poll();
            for (int y : rooms.get(x)) {
                if (visited[y] == true) continue;
                pq.add(y);
                visited[y] = true;
            }
        }

        for (boolean x : visited) {
            if (!x) return x;
        }
        return true;
    }
}