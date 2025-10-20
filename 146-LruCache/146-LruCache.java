// Last updated: 10/20/2025, 11:46:16 AM
class LRUCache {
    private Map<Integer, Node> map;
    private Node head;
    private Node tail;
    private int size;

    public LRUCache(int capacity) {
        size = capacity;
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    private void deleteNode(Node p) {
        Node prev = p.prev;
        Node next = p.next;
        prev.next = next;
        next.prev = prev;
    }

    private void addNode(Node newNode) {
        Node temp = head.next;
        head.next = newNode;
        newNode.prev = head;
        newNode.next = temp;
        temp.prev = newNode;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node p = map.get(key);
        deleteNode(p);
        addNode(p);
        map.put(key, head.next);

        return head.next.val;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node c = map.get(key);
            deleteNode(c);
            c.val = value;
            addNode(c);
            map.put(key, head.next);
        } else {
            if (map.size() == size) {
                Node prev = tail.prev;
                deleteNode(prev);
                Node node = new Node(key, value);
                addNode(node);
                map.remove(prev.key);
                map.put(key, head.next);
            } else {
                Node node = new Node(key, value);
                addNode(node);
                map.put(key, head.next);
            }
        }
    }
}

class Node {
    public int key;
    public int val;
    public Node next;
    public Node prev;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        next = null;
        prev = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */