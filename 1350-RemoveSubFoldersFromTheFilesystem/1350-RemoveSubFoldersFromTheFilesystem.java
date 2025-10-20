// Last updated: 10/20/2025, 11:39:53 AM
class Solution {
    TrieNode root;
    
    Solution() {
        root = new TrieNode();
    }

    public List<String> removeSubfolders(String[] folders) {
        for (String folder : folders) {
            TrieNode currentNode = root;
            String[] paths = folder.split("/");

            for (String path : paths) {
                if (path.length() == 0) continue;

                if (!currentNode.children.containsKey(path)) {
                    currentNode.children.put(path, new TrieNode());
                }

                currentNode = currentNode.children.get(path);
            }
            currentNode.endOfDir = true;
        }

        List<String> result = new ArrayList<>();

        for (String folder : folders) {
            TrieNode currentNode = root;
            String[] paths = folder.split("/");
            boolean isEnd = false;

            for (int i = 0; i < paths.length; i++) {
                if (paths[i].length() == 0) continue;
                if (currentNode.children.get(paths[i]).endOfDir && i != paths.length - 1) {
                    isEnd = true;
                    break;
                }
                currentNode = currentNode.children.get(paths[i]);
            }
            if (!isEnd) result.add(folder);
        }

        return result;
    }

}

class TrieNode {
    boolean endOfDir;
    Map<String, TrieNode> children;

    TrieNode () {
        this.endOfDir = false;
        this.children = new HashMap<>();
    }
}