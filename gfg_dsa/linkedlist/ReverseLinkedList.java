package linkedlist;

public class ReverseLinkedList
{
    static class Node
    {
        int data;
        Node next;

        Node( int data)
        {
            this.data = data;
            this.next = null;
        }

        static Node reverselinkedList(Node head)
        {
                Node current = head;
                Node previous = null;

                while( current != null)
                {           //10 → 20 → 30 → null
                    Node nextNode = current.next; //(20)

                    current.next = previous;  //10→null

                    previous = current;     // previous → 10 → null

                    current = nextNode;     // current → 20 → 30 → null

                }
                return previous;
        }
        static void traverse (Node head)
        {
            Node current = head;
            while ( current != null)
            {
                System.out.print( current.data + " ");
                current = current.next;
            }
        }

        public static void main (String[] args)
        {
            Node first = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            Node fourth = new Node(40);

            first.next = second;
            second.next = third;
            third.next = fourth;

            System.out.print("Before reverse: ");
            traverse(first);

            first = reverselinkedList(first);

            System.out.print("After reverse: ");
            traverse(first);
        }

    }
}
