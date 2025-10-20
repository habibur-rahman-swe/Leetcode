// Last updated: 10/20/2025, 11:41:39 AM
class Solution {

  public String[] uncommonFromSentences(String s1, String s2) {
    
    Map<String, Integer> count = new HashMap<>();
    for (String word : (s1 + " " + s2).split(" ")) {
      count.put(word, count.getOrDefault(word, 0) + 1);
    }

    return count.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(entry -> entry.getKey())
            .toArray(String[]::new);
  }
}