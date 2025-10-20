// Last updated: 10/20/2025, 11:39:12 AM
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> matchingWords = new ArrayList<>();
        TrieNode root = new TrieNode();

        for (String word : words) {
            for (int startIndex = 0; startIndex < word.length(); startIndex++) {
                insertWord(root, word.substring(startIndex));
            }
        }

        for (String word : words) {
            if (isSubstring(root, word)) {
                matchingWords.add(word);
            }
        }
        return matchingWords;
    }

    class TrieNode {
        int frequency;
        Map<Character, TrieNode> childNodes;

        TrieNode () {
            frequency = 0;
            childNodes = new HashMap<>();
        }
    }

    private void insertWord(TrieNode root, String word) {
        TrieNode currentNode = root;
        for (char c : word.toCharArray()) {
            currentNode.childNodes.putIfAbsent(c, new TrieNode());
            currentNode = currentNode.childNodes.get(c);
            currentNode.frequency++;
        }
    }

    private boolean isSubstring(TrieNode root, String word) {
        TrieNode currentNode = root;
        for (char c : word.toCharArray()) {
            currentNode = currentNode.childNodes.get(c);
        }
        return currentNode.frequency > 1;
    }
}
