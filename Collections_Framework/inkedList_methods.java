import java.util.LinkedList;

public class inkedList_methods
{
    public static void main(String[] args)
    {
        LinkedList l1 = new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add("Kaif");
        l1.add("kf1");

        l1.addFirst("first element");
        l1.addLast("last element");
        l1.getFirst();
        System.out.println(l1.getLast());;
        System.out.println(l1);

        //also
        //removeFirst();
        //removeLast()


    }
}
