// Last updated: 10/20/2025, 11:40:03 AM
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder("");
        PriorityQueue<Node> pq = new PriorityQueue<>((n1, n2) -> (n2.val - n1.val));

        if (a != 0) pq.add(new Node('a', a));
        if (b != 0) pq.add(new Node('b', b));
        if (c != 0) pq.add(new Node('c', c));

        char prevChar = ' ';
        int prevCharCnt = 0;

        while (!pq.isEmpty()) {
            Node first = pq.poll();
            if (prevChar != first.ch) {
                sb.append(first.ch);
                first.val = first.val - 1;
                prevCharCnt = 1;
                prevChar = first.ch;

                if (first.val != 0) pq.add(first);
            } else if (prevChar == first.ch && prevCharCnt < 2) {
                sb.append(first.ch);
                prevCharCnt++;
                first.val = first.val - 1;
                if (first.val != 0) pq.add(first);
            } else {
                if (prevChar == first.ch && prevCharCnt == 2 && !pq.isEmpty()) {
                    Node second = pq.poll();
                    sb.append(second.ch);
                    prevChar = second.ch;
                    prevCharCnt = 1;
                    second.val = second.val - 1;
                    pq.add(first);
                    if (second.val != 0) pq.add(second);
                } else {
                    break;
                }
            }
        }

        return sb.toString();
    }
}

class Node {
    char ch;
    int val;
    Node(char ch, int val) {
        this.ch = ch;
        this.val = val;
    }
}