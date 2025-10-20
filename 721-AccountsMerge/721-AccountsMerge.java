// Last updated: 10/20/2025, 11:42:47 AM
class Solution {
    
    public List<List<String>> accounts;

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        this.accounts = accounts;
        
        int n = accounts.size();
        int arr[] = new int[n];
        Arrays.fill(arr, -1);

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) continue;
            Set<Integer> set = new HashSet<>();
            List<Integer> cg = new ArrayList<>();

            for (int j = 1; j < accounts.get(i).size(); j++) {
                set.add(accounts.get(i).get(j).hashCode());
            }

            for (int k = i + 1; k < n; k++) {
                for (int j = 1; j < accounts.get(k).size(); j++) {
                    if (set.contains(accounts.get(k).get(j).hashCode())) {
                        adj.get(i).add(k);
                        adj.get(k).add(i);
                        break;
                    }
                }
            }
        }

        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i]) continue;
            res.add(new ArrayList());
            getRes(i, adj, res, visited);
        }
        
        List<List<String>> result = new ArrayList<>();
        System.out.println(adj);
        for (List<String> list : res) {
            String name = list.remove(0);
            HashSet<String> acc = new HashSet<>(list);
            result.add(new ArrayList(acc));
            Collections.sort(result.get(result.size() - 1));
            result.get(result.size() - 1).add(0, name);
        }

        return result;
    }

    private void getRes(int idx, List<List<Integer>> adj, List<List<String>> res, boolean[] visited) {
        if (visited[idx]) return;
        visited[idx] = true;

        if (res.get(res.size() - 1).size() == 0) {
            res.get(res.size() - 1).add(accounts.get(idx).get(0));
        }
        for (int i = 1; i < accounts.get(idx).size(); i++) {
            res.get(res.size() - 1).add(accounts.get(idx).get(i));
        }

        for (int x : adj.get(idx)) {
            getRes(x, adj, res, visited);
        }
        
    }
}