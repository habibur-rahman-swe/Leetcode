// Last updated: 10/20/2025, 11:35:20 AM
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    int count = 0;
}

class Trie {
    TrieNode root = new TrieNode();
    
    void insert(String s) {
        TrieNode node = root;

        for (char c : s.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
            node.count++;
        }
    }

    int findScore(String s) {
        TrieNode node = root;
        int sum = 0;
        for (char c : s.toCharArray()) {
            node = node.children[c - 'a'];
            sum += node.count;
        }
        return sum;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie root = new Trie();

        for (String str : words) {
            root.insert(str);
        }

        int[] res = new int[words.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = root.findScore(words[i]);
        }
        return res;
    }
}