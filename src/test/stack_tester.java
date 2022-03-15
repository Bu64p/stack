package test;

import stack.stack;

public class stack_tester {

	public static void main(String[] args) throws Exception {
		// LIFO: last in, first out
		stack myStack = new stack();
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		/*
		 *  order of enter:
		 * 1. A
		 * 2. B
		 * 3. C
		 * 4. D
		 */
		System.out.println((String)myStack.pop());
		System.out.println((String)myStack.pop());
		System.out.println((String)myStack.pop());
		System.out.println((String)myStack.pop());
		/*
		 *  order of pop:
		 * 1.D
		 * 2.C
		 * 3.B
		 * 4.A
		 */	
	}
}
