package com.example.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class StackExample {
	
	static ArrayList<String> tempstate = new ArrayList<>();
	
	
	
	
	public static void inputText(String text) {
		
			tempstate.add(text);
		
		}
		public static void undo()
		{
			
			if(!tempstate.isEmpty()) tempstate.remove(tempstate.size()-1);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Stack<Integer> stack = new Stack<>();
		 * 
		 * stack.push(10); stack.push(34); stack.push(56);
		 * System.out.println("Stack Elements : "+ stack);
		 * 
		 * System.out.println("Popped element : " + stack.pop());
		 * System.out.println("Top Element : " + stack.peek());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //managing incoming customer calls Queue<String> queue = new LinkedList<>();
		 * queue.add("Customer 1"); queue.add("Customer 2"); queue.add("Customer 3");
		 * 
		 * System.out.println("Queue Elements : "+ queue);
		 * 
		 * System.out.println("Removed element : " + queue.poll()); //remove the element
		 * System.out.println("Next Customer in a pipeline : " + stack.peek());
		 */
		
		
		inputText("Hello..");
		inputText("Java..");
		inputText("Learning..");
		
		System.out.println("current data : " + tempstate);
		
		undo();
		System.out.println("After Undo Operation : "+ tempstate);
	}

}

// implement a stack using an array (without stack class).
// Simulate a restaurant order processing queue.

// Manage the queue scheduler without queue and with queue(Automatic task processing)



