// Last updated: 10/20/2025, 11:48:59 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Trie trie = new Trie();

        for (String str : strs) {
            trie.insert(str);
        }

        return trie.longestCommonPrefix(strs[0], strs.length);
    }
}


class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.next[c - 'a'] == null) {
                curr.next[c - 'a'] = new TrieNode(c);
            }
            curr = curr.next[c - 'a'];
            curr.count++;
        }
    }

    void print() {
        print(root);
    }

    private void print(TrieNode root) {
        for (TrieNode node : root.next) {
            if (node != null) {
                System.out.print(node.count + " ");
                print(node); 
            }
        }
    }

    public String longestCommonPrefix(String str, int len) {
        StringBuilder res = new StringBuilder("");
        TrieNode curr = root;
        for (char c : str.toCharArray()) {
            curr = curr.next[c - 'a'];
            if (curr.count == len) {
                res.append(c);
            }
        }
        return res.toString();
    }
}

class TrieNode {
    char ch;
    TrieNode[] next = new TrieNode[26];
    int count = 0; 

    TrieNode() {
    }

    TrieNode(char ch) {
        this.ch = ch;
    }
}