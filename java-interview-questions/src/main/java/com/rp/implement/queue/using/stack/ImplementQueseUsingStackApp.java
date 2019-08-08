/**
 *  :: Requirement ::
 *  ==================
 *  	>> How can we implement Queue using Stack no extra methods
 *  		just two methods of Stack - push(e) & pop() and two methods
 *  		in Queue - queue(e) & dequeue().
 *  
 *  
 *  :: Solution ::
 *  =================
 *  	>> Implementation details is available in class "QueueUsingStack.java"
 *  
 *  	>> To implement Queue using Stack we have to take two stacks(eg. stack1 & stack2) and provide two methods queue and dequeue with the below
 *  		 provided logic.
 *  		1. queue
 *  		-----------
 *  			>> Simply take the element and store data in Stack using stack's push method, no extra code required.
 *  			>> Let say we are using 'stack1' instance to store data in queue() method.
 *  
 *   		2. deQueue
 *   		----------------
 *   			>> For deQueue first check whether there is any data in 'stack2' instance or not. 
 *   				>> if 'NO',
 *   				------------
 *   					>> take the data from 'stack1' and store in 'stack2'.
 *   				>> if 'yes',
 *   				------------    
 *   					>> simply call pop method on 'stack2' instance.
 */

package com.rp.implement.queue.using.stack;


public class ImplementQueseUsingStackApp {

	public static void main(String[] args) {
		
		QueueUsingStack queue = new QueueUsingStack();
		
		
		System.out.println("Inserted : " + queue.queue("1"));
		System.out.println("Inserted : " + queue.queue("2"));
		System.out.println("Inserted : " + queue.queue("3"));
		System.out.println("Inserted : " + queue.queue("4"));
		System.out.println("Inserted : " + queue.queue("5"));
		System.out.println("Inserted : " + queue.queue("6"));
		
		System.out.println("Removed : " + queue.deQueue());
		System.out.println("Removed : " + queue.deQueue());
		System.out.println("Removed : " + queue.deQueue());
		System.out.println("Removed : " + queue.deQueue());
		System.out.println("Removed : " + queue.deQueue());
		System.out.println("Removed : " + queue.deQueue());
		
		
		
	}

}
