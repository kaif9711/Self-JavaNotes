import java.util.Stack;

public class stack_methods
{
    public static void main(String[] args)
    {
        Stack s = new Stack();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        System.out.println(" " + s.peek());
        System.out.println(" " + s.push(60));
        //System.out.print(s);
        System.out.println(s.search(20));
        System.out.println(s.empty());









    }
}
