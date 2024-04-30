import java.util.HashMap;

public class LRUCaching {
    public static class Node {
        Node previous;
        int key;
        int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.previous = this.next = null;
        }
    }

    int capacity;
    Node head = null;
    Node tail = null;
    HashMap<Integer, Node> map;

    LRUCaching(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        } else if (map.size() == capacity) {
            remove(tail);
        } else {
            // Two possible cases: The cache is completely empty or there is some room
            Node newNode = new Node(key, value);
            insertHead(newNode);
        }
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        } else {
            remove(node);
            insertHead(node);
            return node.value;
        }
    }

    // to be implemented.
    void insertHead(Node newNode) {
        map.put(newNode.key, newNode);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    // to be implemented.
    void remove(Node node) {
        if (node == null) {
            return;
        }
        map.remove(node.key);
        if (node == tail) {
            node.previous.next = null;
            tail = node.previous;
            node.next = node.previous = null;
        } else if (node == head) {
            node.next.previous = null;
            head = node.next;
            node.previous = node.next = null;
        } else {
            node.next.previous = node.previous;
            node.previous.next = node.next;
            node.previous = node.next = null;
        }
    }
}
