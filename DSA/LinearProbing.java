public class LinearProbing {
    class KeyValuePair {
        int key;
        int value;

        KeyValuePair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    KeyValuePair hashMap[];
    int capacity;

    public LinearProbing(int capacity) {
        this.capacity = capacity;
        hashMap = new KeyValuePair[capacity];
    }

    void add(int key, int value) {
        int temp = findHash(key);
        while (hashMap[temp] != null && hashMap[temp].key != key) {
            temp = (temp + 1) % capacity;
        }
        hashMap[temp] = new KeyValuePair(key, value);
    }

    int findHash(int key) {
        return (2 * key + 3) % 10;
    }

    int get(int key){
        int tmp = findHash(key); 
        while (hashMap[tmp] != null) {
            if (hashMap[tmp].key == key) {
                return hashMap[tmp].value;
            }
            tmp = (tmp + 1) % capacity;
        }
        return -1;
    }
}
