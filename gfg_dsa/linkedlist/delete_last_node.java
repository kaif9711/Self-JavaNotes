package linkedlist;

public class delete_last_node
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
        static Node deletelastNode(Node head)
        {
         Node current = head;
         while(current.next.next != null)
         {
             current = current.next;
         }
         current.next = null;
         return head;
        }

        static void traverse(Node head)
        {
            Node current = head;
            while(current != null)
            {
                System.out.println(current.data);
                current = current.next;
            }
        }
        public static void main(String[] args)
        {
            Node first = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            Node fourth = new Node(40);

            first.next=second;
            second.next=third;
            third.next=fourth;

            System.out.println("Before deletion of last node");
            traverse(first);

            System.out.println("After deleteion of last node");
            first = deletelastNode(first);
            traverse(first);
        }

    }
}
