package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue_Operations
{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // inserting elements at rear
        q.add(10);
        q.add(20);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.offer(80);

        System.out.println(q);

        q.poll();
        System.out.println(q);

        System.out.println(q.peek());

        if(q.isEmpty())
        {
            System.out.println("Is empty");
        }
        else
        {
            System.out.println("not empty");
        }

        System.out.println(((LinkedList<Integer>) q).getLast());
//        System.out.println(((LinkedList<Integer>) q).getLast());

        System.out.println(q.add(100));




    }

}
