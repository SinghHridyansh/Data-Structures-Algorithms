package QueueImplementation;

import java.util.Queue;
import java.util.Stack;


public class ReverseFirstK {
	
	

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		if (k<=0 || k>input.size()) {
			return input;
		}

		Stack<Integer> stack=new Stack<>();
		for (int i = 0; i < k; i++) {
			stack.push(input.poll());
		}
		while (!stack.isEmpty()) {
			input.add(stack.pop());
		}

		int remainingSize=input.size()-k;
		for (int i = 0; i < remainingSize; i++) {
			input.add(input.poll());
		}

		return input;
	}
}
