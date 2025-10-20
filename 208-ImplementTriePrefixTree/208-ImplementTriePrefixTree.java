// Last updated: 10/20/2025, 11:45:33 AM
class Trie {
    TreeNode root;
    
    public Trie() {
       root = new TreeNode(); 
    }
    
    public void insert(String word) {
        TreeNode head = root;
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (head.linkes[c-'a'] == null) head.linkes[c-'a'] = new TreeNode();
            head = head.linkes[c-'a'];
        }
        head.isEnd = true;
    }
    
    public boolean search(String word) {
        TreeNode head = root;
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (head.linkes[c-'a'] == null) return false;
            head = head.linkes[c-'a'];
        }
        
        return head.isEnd;
    }
    
    public boolean startsWith(String word) {
        
        TreeNode head = root;
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (head.linkes[c-'a'] == null) return false;
            head = head.linkes[c-'a'];
        }
        
        return true;
    }
}

class TreeNode {
    public TreeNode[] linkes;
    public boolean isEnd;
    TreeNode() {
        linkes = new TreeNode[26];
        
        isEnd = false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */