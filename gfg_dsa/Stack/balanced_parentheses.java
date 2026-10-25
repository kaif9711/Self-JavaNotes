package Stack;

import java.util.Stack;

public class balanced_parentheses
{
    static boolean isBalance(String expression)
    {
        // stack stores the opening brackets
        Stack <Character> stack = new Stack<>();

        // read the expression from left to right
        for(int i = 0; i<expression.length(); i++)
        {
            char ch = expression.charAt(i); //extracting the character

            if(ch == '(' || ch =='{' || ch=='[')    // matchin the opening brackets , if exists then push into the stack
            {
                stack.push(ch);
            }

            else if( ch == ')' || ch == '}' || ch==']') // now for clsing brackets
            {
                if(stack.isEmpty())     // first checking if the stack is already empty,
                {
                    return false;
                }
            /*
                 Remove the latest opening bracket.

                 Example:
                 Stack: ( { [
                 Current character: ]

                 stack.pop() returns '['.
                */

            char openingBracket = stack.pop();  // now poping the opening brackets from the stack and matching it them with the closeing brackets

           /*
              Check whether ')' matches '('.
              If it does not match, brackets are invalid.
               */
            if(ch == ')' && openingBracket != '(')
            {
                return false;
            }

            /*
                 Check whether '}' matches '{'.
                */
                if(ch == '}' && openingBracket != '{')
                {
                    return false;
                }
             /*
                 Check whether ']' matches '['.
                */
                if(ch == ']' && openingBracket != '[')
                {
                    return false;
                }
            }
        }
        /*
         At the end, the stack must be empty.

         Empty stack means every opening bracket
         got its correct closing bracket.
        */
        return stack.empty();
    }

    public static void main(String[] args)
    {
        String expression = "({[]})";
        /*
         Processing:
         '(' → push
         '{' → push
         '[' → push
         ']' → pop '['
         '}' → pop '{'
         ')' → pop '('

         The stack becomes empty,
         so the expression is balanced.
        */
        if(isBalance(expression))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not-Balance");
        }
    }
}
