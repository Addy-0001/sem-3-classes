public class CircularQueue {
    int front = -1;
    int rear = -1;
    int size;

    int circQueue[];

    public CircularQueue(int size) {
        this.size = size;
        circQueue = new int[size];
    }

    boolean isFull() {
        if (front == (rear + 1) % size) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            circQueue[rear] = data;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Nothing to dequeue, queue is empty");
            return -1;
        } else {
            if (front == (rear + 1) % size) {
                int temp = circQueue[front];
                front = rear = -1;
                return temp;
            }
            int temp = front;
            front = (front + 1) % temp;
            return circQueue[temp];
        }
    }
}
