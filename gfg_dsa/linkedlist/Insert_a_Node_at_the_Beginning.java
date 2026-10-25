package linkedlist;

public class Insert_a_Node_at_the_Beginning
{
    static class Node
    {
        int data;
        Node Next;

        Node(int data)
        {
            this.data = data;
        }
    }

    static Node insertatBeginning(Node head, int data)      // this method is to replace the newNode with the head node, and return head
    {
        Node newNode = new Node(data);

        newNode.Next = head;
        head  =newNode;        // new head → 5 → 10 → 20 → 30

        return head;
    }

    static void traverse( Node head)            // this is to traves from head
    {
        Node current = head;
        while(current != null)      //It stops at the last node.
        {
            System.out.println(current.data);
            current = current.Next;
        }
    }

    public static void main(String[] args)
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.Next = second;
        second.Next = third;

        System.out.println(" before insertyion");
        traverse(first);

        System.out.println(" After new node insertion  ");

         first = insertatBeginning(first, 5 ); //The assignment is necessary because first must now refer to the new first node.
        traverse(first);

    }


}
