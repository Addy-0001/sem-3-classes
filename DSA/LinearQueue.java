public class LinearQueue {
    int front = -1;
    int rear = -1;

    int Queue[];

    int size;

    LinearQueue(int size) {
        this.size = size;
        Queue = new int[size];
    }

    boolean isFull() {
        if (rear == size - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (rear == -1 && front == -1) {
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
                Queue[rear] = data;
            }
            Queue[rear] = data;
            rear++;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        if (front == rear) {
            int temp = Queue[front];
            this.front = this.rear = -1;
            return temp;
        }
        front++;
        return Queue[front - 1];
    }
}
