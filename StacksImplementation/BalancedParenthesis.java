package StacksImplementation;

import java.util.Stack;

public class BalancedParenthesis {

	
	public static void main(String[] args) {
		//Stack<Integer> stack=new Stack<>();
		// stack.push(20);
		// System.out.println(stack.peek());
		// System.out.println(stack.size());
		// System.out.println(stack.pop());
		// System.out.println(stack.isEmpty());
		System.out.println(isBalanced("(()(())"));
		System.out.println(isBalanced(")()()"));
	}

	public static boolean isBalanced(String expression) {
        //Your code goes here
		Stack<Character> stack=new Stack<>();
		for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                
                stack.push(ch);
            } else if (ch == ')') {
                
                if (!stack.isEmpty() && stack.peek() == '(') {
                     
                    stack.pop();
                } else {
                 
                    return false;
                }
            }
        }

		return stack.isEmpty();
    }

}
 