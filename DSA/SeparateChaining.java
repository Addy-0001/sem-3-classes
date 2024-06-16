public class SeparateChaining {
    SinglyLinkedList hashTable[];
    int capacity;

    public SeparateChaining(int capacity) {
        this.capacity = capacity;
        hashTable = new SinglyLinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            hashTable[i] = new SinglyLinkedList();
        }
    }

    void add(int key) {
        int temp = findHash(key);
        hashTable[temp].addNodeTail(key);
    }

    int findHash(int key) {
        return (2 * key + 3) % 10;
    }

    int get(int key){
        int tmp = findHash(key); 
        SinglyLinkedList.Node current = hashTable[tmp].head; 
        while (current != null) {
            if (current.data == key) {
               return key;
            }
            current = current.next;
            
        }
        return -1;
    }
}
