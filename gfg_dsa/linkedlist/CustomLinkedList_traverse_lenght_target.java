package linkedlist;

class Node
{
    int data;
    Node next;  // will be reference to other node

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}


public class CustomLinkedList_traverse_lenght_target
{
        static void traverse(Node head)         // here head will be the reference to the first node // linkedlist.Node is the type
        {
            Node current  = head;               // current is the pointer to that head(first node)
            while(current != null)              //
            {
                System.out.print(current.data + " ");
                current = current.next;         // moving the pointer(current) to the next node
            }

        }

        static int length( Node head)
        {
            Node current = head;        //always have to specify the pointer to the head always to begin
            int count = 0;
            while(current != null)
            {
                count ++;                   // counts the nodes
                current = current.next;        // moving to next node
            }
            return count;
        }

        static boolean search( Node head, int target)
        {
            Node current = head;            //always have to specify the pointer to the head always to begin
            while(current != null)
            {
                if(current.data == target)
                {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public static void main(String[] args)
        {
            Node first = new Node(12);
            Node second = new Node(13);
            Node third = new Node(14);

            first.next = second;
            second.next = third;

            traverse(first);

            System.out.println("\n**********************************************") ;
            int size = length(first);
            System.out.println("\nSize of the liunked list is " + size);

            System.out.println("**********************************************") ;
            System.out.println(search(first, 15)) ;

        }
}

