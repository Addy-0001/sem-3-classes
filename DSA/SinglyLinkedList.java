public class SinglyLinkedList {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    int size = 0;
    Node head = null;
    Node tail = null;

    void addNodeTail(int data) {
        Node newnode = new Node(data);
        if (head == null || tail == null) {
            head = tail = newnode;
        } else {
            // Node current = head;
            // while (current.next != null){
            // current = current.next;
            // }
            // current.next = newnode;
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    void addNodeHead(int data) {
        Node newNode = new Node(data);
        if (head == null || tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void insertDataAtAnyPosition(int position, int data) {
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 2; i < position; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeDataAtAnyPosition(int position, Node head) {
        Node current = head;
        for (int i = 2; i < position; i++) {
            current = current.next;
        }
        Node nextNode = current.next;
        current.next = nextNode.next;
        nextNode.next = null;
    }

    public int getDataAtAnyPosition(int position, Node head) {
        Node current = head;
        for (int i = 2; i <= position; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void removeNodeAtMemoryLocation(Node node, Node head) {
        Node current = head;
        while (current.next != node) {
            current = current.next;
        }
        // Node next = current.next;
        current.next = node.next;
        node.next = null;
    }

    // Insert Data before and after node
    public void insertDataAfterNode(int data, Node node) {
        Node current = node;
        Node newNode = new Node(data);
        newNode.next = current.next; 
        current.next = newNode;
    }

    public void insertDataBeforeNode(int data, Node node){
        Node current = head; 
        Node newNode = new Node(data); 
        while(current.next != node){
            current = current.next;
        }
        newNode.next = current.next; 
        current.next = newNode; 
    }

    // Remove Head
    public void removeHead(Node head){
        Node current = head; 
        this.head = current; 
        current.next = null; 
    }

    // Remove Tail
    public void removeTail(){
        Node current = head; 
        while (current.next != tail){
            current = current.next;
        }
        current.next = null; 
        tail = current; 
    }
    // Reverse a linked list
    public Node reverseLinkedList(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }

    // Detect Cycle in Linked List
    public boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow.next != null || fast!=null) {
            slow = slow.next;
            fast = fast.next.next; 
            if (fast==slow) {
                return true;
            }
        }
        return false;
    }

    public void mergeTwoSortedLinkedList(Node head){ 

    }
}
