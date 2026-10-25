package Stack;

public class stack_using_LinkedList {

    // Node represents one element of the stack
    static class Node {
        int data;       // Stores the value
        Node next;      // Stores reference to the next node

        // Constructor creates a node with the given value
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // top points to the top node of the stack
    Node top;

    // Constructor initializes an empty stack
    stack_using_LinkedList()
    {
        top = null;
    }

    // Adds a new node to the top of the stack
    void push(int value) {
        // Create a new node
        Node nextNode = new Node(value);

        // Connect the new node to the current top
        nextNode.next = top;

        // Make the new node the new top
        top = nextNode;
    }

    // Removes and returns the top element
    int pop() {
        // Check whether the stack is empty
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        // Store the top node's value
        int value = top.data;

        // Move top to the next node
        top = top.next;

        // Return the removed value
        return value;
    }

    // Returns the top element without removing it
    int peek() {
        // Check whether the stack is empty
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        // Store the top node's value
        int value = top.data;

        // Return the top value
        return value;
    }

    // Checks whether the stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // A linked-list stack has no fixed capacity
    boolean isFull() {
        return false;
    }

    // Calculates and returns the stack size
    int size() {
        int count = 0;

        // Start counting from the top node
        Node current = top;

        // Visit every node in the stack
        while (current != null) {
            count++;

            // Print the current node's value
            System.out.println(current.data);

            // Move to the next node
            current = current.next;
        }

        // Return the total number of nodes
        return count;
    }

    public static void main(String[] args) {

        // Create an empty stack
        stack_using_LinkedList stack = new stack_using_LinkedList();

        // Add elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Find and print the stack size
        int size1 = stack.size();
        System.out.println("size is : " + size1);

        // View the top element without removing it
        System.out.println("First element is : " + stack.peek());

        // Remove and print the top element
        System.out.println("Remove top element  : " + stack.pop());

        // Find the size after removing the top element
        System.out.println(" size after removing top element" + stack.size());

        // Check whether the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Check whether the stack is full
        System.out.println("Is stack full? " + stack.isFull());
    }
}
