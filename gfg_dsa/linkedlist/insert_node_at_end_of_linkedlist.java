package linkedlist;

public class insert_node_at_end_of_linkedlist
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
    static Node insertatEnd(Node head, int data)
    {
        Node newNode = new Node(data);
        Node current = head;

        while(current.next != null)
        {
            //System.out.println(current.data); // no need to print
            current = current.next;
        }
        current.next = newNode;
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

        first.next = second;
        second.next = third;

        System.out.println("befer insert at end");
        traverse(first);

        System.out.println("After insert at end");
        first = insertatEnd(first, 40);
        traverse(first);

    }
}
