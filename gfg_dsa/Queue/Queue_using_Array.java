package Queue;

public class Queue_using_Array {

    int[] queue;
    int front;
    int rear;
    int capacity;

    Queue_using_Array(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];

        // Initially, the queue is empty
        front = 0;
        rear = -1;
    }

    // Adds an element at the rear
    void enqueue(int value) {
        // Check whether the queue is full
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        // Move rear to the next position
        rear++;

        // Store the value at rear
        queue[rear] = value;
    }

    // Removes and returns the front element
    int dequeue() {
        // Check whether the queue is empty
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        // Store the front value
        int value = queue[front];

        // Move front to the next element
        front++;

        // Return the removed value
        return value;
    }

    // Returns the front element without removing it
    int peek() {
        // Check whether the queue is empty
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    // Checks whether the queue is empty
    boolean isEmpty() {
        return front > rear;
    }

    // Checks whether the queue is full
    boolean isFull() {
        return rear == capacity - 1;
    }

    // Prints elements from front to rear
    void traverse() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Queue_using_Array queue = new Queue_using_Array(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.print("Queue: ");
        queue.traverse();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Removed element: " + queue.dequeue());

        System.out.print("Queue after dequeue: ");
        queue.traverse();

        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Is queue full? " + queue.isFull());
    }
}
