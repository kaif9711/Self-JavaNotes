package linkedlist;

public class Delete_at_first_node
{
        static class Node
        {
            int data;
            Node next;

            Node(int data)
            {
                this.data = data;
            }

        }
            static Node deletefirstNode(Node head)
            {
                head = head.next;       // moving the head to the next(ahead) node of the head
                return head;
            }

            static void traverse (Node head)
            {
                Node current = head;
                while(current != null)
                {
                    System.out.println(current.data);
                    current=current.next;
                }

            }
            public static void main(String[] args)
            {
                Node first = new Node(10);
                Node second = new Node(20);
                Node third = new Node(30);
                Node fourth = new Node(40);

                first.next = second;
                second.next = third;

                System.out.println("before first element deleteion");
                traverse(first);

                System.out.println("After first element deleteion");
                first = deletefirstNode(first);
                traverse(first);
            }

        }


