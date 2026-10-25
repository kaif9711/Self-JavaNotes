package linkedlist;

public class Insert_Node_at_Specific_Position
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static Node insertspecifiPosition(Node head, int data, int position)
    {
        Node newNode = new Node(data);

        if (position == 1)          // Insert at the beginning
        {
        newNode.next = head;
        return newNode;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++)      // Move to the node before the required position
        {
            current = current.next;
        }

        newNode.next = current.next;         // Connect the new node
        current.next = newNode;

        return head;
    }

        static void traverse(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

        public static void main(String[] args)
        {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        System.out.print("Before insertion: ");
        traverse(first);

        first = insertspecifiPosition(first, 15, 2);

        System.out.print("After insertion: ");
        traverse(first);
    }



}

