package com.celcom.day9;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		stack.push(20);
		stack.push(30);
		stack.push(12);
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
	}

}
