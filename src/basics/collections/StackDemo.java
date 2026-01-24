package basics.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);

        Integer removedElement = stack.pop();
        System.out.println(removedElement);
        System.out.println(stack);

        Integer peekElement = stack.peek();
        System.out.println(peekElement);
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        System.out.println(stack.search(3)); // returns 1-based index starting from the top of the stack.

        // We can also add-remove elements from the middle in stack as inherits from Vector.
        stack.remove(Integer.valueOf(5));
        System.out.println(stack);

        stack.remove(1);
        System.out.println(stack);
    }
}
