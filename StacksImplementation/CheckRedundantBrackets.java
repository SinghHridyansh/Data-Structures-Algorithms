package StacksImplementation;

import java.util.Stack;

public class CheckRedundantBrackets {
	

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		 Stack<Character> stack = new Stack<>();


		 for (char ch : expression.toCharArray()) {
            if (ch == ')') {
               
                boolean hasOperators = false;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperators = true;
                    }
                }

            
                if (!hasOperators) {
                    return true;
                }

       
                stack.pop();
            } else {
         
                stack.push(ch);
            }
        }

  
        return false;
	}

	public static void main(String[] args) {
		
	}
}
