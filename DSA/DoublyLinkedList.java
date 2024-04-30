public class DoublyLinkedList {
    public static class Node {
        Node previous;
        Node next;
        int key;
        int value; 
        int data; 
        public Node(int data){
            this.data = data; 
            this.previous = this.next = null; 
        }
    }

    Node head = null; 
    Node tail = null; 

    void insertTail(int data){
        Node newNode = new Node(data); 
        if (head == null || tail == null){
            head = tail = newNode; 
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // insert data after 
    public void insertDataAfter(int data, Node node){
        Node newNode = new Node(data); 
        newNode.next = node.next; 
        newNode.previous = node; 
        node.next.previous = newNode; 
        node.next = newNode;
    }

    // remove node
    public void removeNode(Node node){
        node.next.previous = node.previous; 
        node.previous.next = node.next; 
        node = node.previous = node.next = null; 
    }
}
