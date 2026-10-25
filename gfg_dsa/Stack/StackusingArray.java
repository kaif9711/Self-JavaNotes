package Stack;

public class StackusingArray {

    // Array used to store stack elements
    int[] stack;

    // Stores the index of the top element
    int top;

    // Stores the maximum capacity of the stack
    int capacity;

    // Constructor creates a stack with the given size
    StackusingArray(int size) {
        this.capacity = size;
        this.stack = new int[capacity];

        // -1 means the stack is initially empty
        this.top = -1;
    }

    // Adds an element to the top of the stack
    void push(int value) {

        // Check whether the stack is full
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        // Move top to the next empty position
        top++;

        // Store the value at the top position
        stack[top] = value;
    }

    // Removes and returns the top element
    int pop() {

        // Check whether the stack is empty
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        // Store the top element before removing it
        int value = stack[top];

        // Move top down to the previous element
        top--;

        // Return the removed element
        return value;
    }

    // Returns the top element without removing it
    int peek() {

        // Check whether the stack is empty
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        // Store the top element
        int value = stack[top];

        // Return the top element
        return value;
    }

    // Checks whether the stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Checks whether the stack is full
    boolean isFull() {
        return top == capacity - 1;
    }

    // Prints stack elements from top to bottom
    void traverse()
    {
        // Check whether there are no elements
        if (isEmpty()) {
            System.out.println("Stackundeflow, can't traverse");
            return;
        }

        // Start from top and move toward index 0
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }
    //

    public static void main(String[] args) {

        // Create a stack with capacity 5
        StackusingArray stack = new StackusingArray(5);

        // Add elements to the stack
        stack.push(30);
        stack.push(40);
        stack.push(50); 

        // Display the stack
        System.out.println("Stack ");
        stack.traverse();

        // Display the top element without removing it
        System.out.println("Top element is " + stack.peek());

        // Remove and display the top element
        System.out.println("Removed top element  " + stack.pop());

        // Display the stack after pop
        System.out.println("Stack after pop : ");
        stack.traverse();

        // Check whether the stack is empty
        System.out.println(" Is stack empty? : " + stack.isEmpty());

        // Check whether the stack is full
        System.out.println(" Is stack empty? : " + stack.isFull());


    }
}
