# Last updated: 10/20/2025, 11:35:15 AM
# Constant for the number of letters in the alphabet
ALPHABET_SIZE = 26

class TrieNode:
    def __init__(self):
        # Each TrieNode has children representing 26 letters and a count for tracking prefixes
        self.children = [None] * ALPHABET_SIZE
        self.count = 0

class Trie:
    def __init__(self):
        # Initialize the root of the Trie
        self.root = TrieNode()
    
    def insert(self, word):
        current_node = self.root
        for char in word:
            index = ord(char) - ord('a')
            # Create a new TrieNode if the path doesn't exist
            if not current_node.children[index]:
                current_node.children[index] = TrieNode()
            current_node = current_node.children[index]
            current_node.count += 1  # Increment the prefix count
    
    def find_score(self, word):
        current_node = self.root
        total_score = 0
        for char in word:
            index = ord(char) - ord('a')
            current_node = current_node.children[index]
            total_score += current_node.count
        return total_score

class Solution:
    def sumPrefixScores(self, words):
        """
        :type words: List[str]
        :rtype: List[int]
        """
        # Build the Trie from the list of words
        trie = Trie()
        for word in words:
            trie.insert(word)

        # Use a list comprehension to calculate scores for each word
        return [trie.find_score(word) for word in words]
