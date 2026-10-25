package linkedlist;

public class create_node_from_arraylist_element
{
    static class Node           // we created a nested Node class for practice question
    {
        int data;           // datqa of the node
        Node Next;          // for reference to the next node

        Node(int data)
        {
            this.data = data;
            this.Next = null;
        }
    }


    public static void main(String[] args)
    {
        int[] arr = { 1,2,3,4,5};
        Node first = new Node(arr[1]);
        Node second = new Node(arr[2]);
        Node third = new Node(arr[3]);

        first.Next = second;        // connecting nodes
        second.Next = third;

        Node current = first;       // initialize a pointer(current) at first node
        while(current != null)
        {
            System.out.print(current.data + " ");   // prints data oft the node by pointer pointing to the node(current.data)
            current= current.Next;
        }


    }
}
