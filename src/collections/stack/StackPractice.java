package collections.stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        String s = "Rudra";

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            stack2.push(s.charAt(i));
        }
        System.out.println(stack2);

        System.out.println(isBalanced("()()()"));
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
