package com.rp.implement.queue.using.stack;

import java.util.Iterator;
import java.util.Stack;

public class QueueUsingStack implements Queue{

	private Stack<String> stack1 = new Stack<String>();
	private Stack<String> stack2 = new Stack<String>();

	@Override
	public String queue(String data) {
		return stack1.push(data);
	}


	@Override
	public String deQueue() {
		// Checking if 2nd stack is empty, if empty populate data from 1st stack
		if(stack2.size() == 0){
			Iterator<String> itr = stack1.iterator();
			while(itr.hasNext()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
