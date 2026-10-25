package Queue;

public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    QueueUsingLinkedList() {
        front = null;
        rear = null;
    }

    // Adds an element at the rear
    void enqueue(int value) {
        Node newNode = new Node(value);

        // If queue is empty, both front and rear point to the new node
        if (rear == null) {
            front = newNode;
            rear = newNode;
            return;
        }

        // Connect the new node after the current rear
        rear.next = newNode;

        // Move rear to the new node
        rear = newNode;
    }

    // Removes and returns the front element
    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;

        // Move front to the next node
        front = front.next;

        // If queue becomes empty, rear must also become null
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Returns the front element without removing it
    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    int size() {
        int count = 0;
        Node current = front;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    void traverse() {
        Node current = front;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.print("Queue: ");
        queue.traverse();

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Removed element: " + queue.dequeue());

        System.out.print("Queue after dequeue: ");
        queue.traverse();
    }
}
