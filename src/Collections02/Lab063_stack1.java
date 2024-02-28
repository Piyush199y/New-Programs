package src.Collections02;

import java.util.Stack;

public class Lab063_stack1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.push("E"));
        System.out.println(stack);





    }
}
