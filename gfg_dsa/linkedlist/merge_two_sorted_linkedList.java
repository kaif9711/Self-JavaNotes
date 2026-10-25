package linkedlist;

public class merge_two_sorted_linkedList
{
    static class Node
    {
        int data;

        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static Node merge(Node head1, Node head2)
    {
        Node dummy = new Node(0); //created a temporary node
        Node current = dummy;   // and start the at the dummy node

        while (head1 != null && head2 != null)      // Continue while both lists have nodes
        {
            if (head1.data <= head2.data)  // If the first list's value is smaller
            {
                // Connect current to head1
                // Example: dummy → 1
                current.next = head1;

                // Move head1 to its next node
                // Example: head1 moves from 1 to 3
                head1 = head1.next;
            } else
            {
                // Connect current to head2
                // Example: current → 2
                current.next = head2;

                // Move head2 to its next node
                // Example: head2 moves from 2 to 4
                head2 = head2.next;
            }
            // Move current to the node just added
            current = current.next;
        }


        if (head1 != null) // If list 1 still has nodes, attach the remaining part
        {
            current.next = head1;
        } else            // Otherwise, attach the remaining part of list 2

        {
            current.next = head2;
        }
        // Dummy is only a temporary node
        // The actual merged list starts at dummy.next
        return dummy.next;
    }

    static void traverse(Node head)
    {
        Node current = head;

        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // First sorted list: 1 → 3 → 5
        Node first1 = new Node(1);
        Node second1 = new Node(3);
        Node third1 = new Node(5);

        first1.next = second1;
        second1.next = third1;

        // Second sorted list: 2 → 4 → 6
        Node first2 = new Node(2);
        Node second2 = new Node(4);
        Node third2 = new Node(6);

        first2.next = second2;
        second2.next = third2;

        Node mergedHead = merge(first1, first2);

        System.out.print("Merged list: ");
        traverse(mergedHead);
    }

}


