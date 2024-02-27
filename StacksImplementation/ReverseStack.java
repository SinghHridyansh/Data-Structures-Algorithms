package StacksImplementation;

import java.util.Stack;

public class ReverseStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> input = new Stack<>();
    	Stack<Integer> empty = new Stack<>();

		// input.push(10);
		// input.push(6);
		// input.push(14);
		// input.push(20);
		// input.push(9);
		// input.push(-90);

		int arr[]={5,6,7,1,9};

		for (int i : arr) {
			input.push(i);
		}

		reverseStack(input, empty);

		
	}
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		for (Integer integer : input) {
			System.out.print(integer+" ");
		}
		System.out.println();
		while (!input.isEmpty()) {
			extra.push(input.pop());
		}

		for (Integer integer : extra) {
			System.out.print(integer+" ");
		}
		
	}
}
