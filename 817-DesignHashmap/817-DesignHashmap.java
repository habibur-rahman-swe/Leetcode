// Last updated: 10/20/2025, 11:42:06 AM
class Node {
    int key, val;
    Node next;

    Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class MyHashMap {
    Node[] nodes;

    public MyHashMap() {
        nodes = new Node[1000];
    }
    
    public void put(int key, int value) {
        if (nodes[key % nodes.length] == null) {
            nodes[key % nodes.length] = new Node(key, value);
            return;
        }

        Node prev = null;
        Node pres = nodes[key % nodes.length];

        while (pres != null && pres.key != key) {
            prev = pres;
            pres = pres.next;
        }

        if (pres == null) prev.next = new Node(key, value);
        else pres.val = value;
    }
    
    public int get(int key) {
        if (nodes[key % nodes.length] == null) return -1;

        Node pres = nodes[key % nodes.length];
        while (pres != null && pres.key != key) {
            pres = pres.next;
        }

        return pres == null ? -1 : pres.val;
    }
    
    public void remove(int key) {
        int index = key % nodes.length;
        if (nodes[index] != null) {
            Node prev = null;
            Node cur = nodes[index];
            while (cur != null && cur.key != key) {
                prev = cur;
                cur = cur.next;
            }

            if (cur != null) {
                if (prev != null) {
                    prev.next = cur.next;
                } else {
                    nodes[index] = cur.next;
                }
            }
        }      
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */