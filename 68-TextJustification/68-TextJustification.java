// Last updated: 10/20/2025, 11:47:42 AM
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> temp = new ArrayList<>();
        List<Integer> charEachLine = new ArrayList<>();
        List<Integer> wordEachLine = new ArrayList<>();

        StringBuilder sb = new StringBuilder(words[0]);
        int countChar = words[0].length();
        int countWord = 1;

        for (int i = 1; i < words.length; i++) {
            if (sb.length() + words[i].length() + 1 <= maxWidth) {
                sb.append("#").append(words[i]);
                countChar += words[i].length();
                countWord += 1;
            } else {
                temp.add(sb.toString());
                charEachLine.add(countChar);
                wordEachLine.add(countWord);
                sb = new StringBuilder(words[i]);
                countChar = words[i].length();
                countWord = 1;
            }
        }
        temp.add(sb.toString());
        charEachLine.add(countChar);
        wordEachLine.add(countWord);

        List<String> result = new ArrayList<>();

        for (int i = 0; i < temp.size(); i++) {
            StringBuilder resStr = new StringBuilder("");
            if (wordEachLine.get(i) == 1) {
                resStr.append(temp.get(i));
                while (resStr.length() < maxWidth) {
                    resStr.append(" ");
                }
                result.add(resStr.toString());
                continue;
            }
            int whiteSpace = (maxWidth - charEachLine.get(i)) / (wordEachLine.get(i) - 1);
            int extraSpace = (maxWidth - charEachLine.get(i)) % (wordEachLine.get(i) - 1);
            
            for (char c : temp.get(i).toCharArray()) {
                if (c == '#' && i == temp.size() - 1) {
                    resStr.append(" ");
                } else if (c == '#') {
                    for (int j = 0; j < whiteSpace; j++) {
                        resStr.append(" ");
                    }
                    if (extraSpace > 0) {
                        resStr.append(" ");
                        extraSpace--;
                    }
                } else {
                    resStr.append(c);
                }
            }
            while (resStr.length() < maxWidth) {
                resStr.append(" ");
            }
            result.add(resStr.toString());
        }

        System.out.println(charEachLine);
        return result;
    }
}