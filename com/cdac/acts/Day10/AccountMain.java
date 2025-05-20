package com.cdac.acts.Day10;
import java.util.Scanner;
public class AccountMain {

	public static void main(String args[]) {
		
		try(Scanner sc = new Scanner (System.in)){
			
			Account acc = new Account(10000);
			
			 System.out.print("Enter amount to withdraw: ");
	         int amount = sc.nextInt();
	         
	         try {
	        	 acc.withdraw(amount);
	         }catch(MinBalException e){
	        	 System.out.println("Exception occured" +e.getMessage());
	         }finally {
	        	 System.out.println("withrawal attempt completed ");
	         }
			
	         
	         Queue queue = new Queue(5);
	         
	         queue.enqueue(5);
	         queue.enqueue(4);
	         queue.enqueue(3);
	         queue.enqueue(2);
	         queue.enqueue(1);
	         
	         try {
	        	 	System.out.println("Dequeued item: " + queue.dequeue());
	                System.out.println("Dequeued item: " + queue.dequeue());
	                System.out.println("Dequeued item: " + queue.dequeue());
	                System.out.println("Dequeued item: " + queue.dequeue());
	                System.out.println("Dequeued item: " + queue.dequeue());    
	                System.out.println("Dequeued item: " + queue.dequeue());    
	                
	        	 
	         }catch (QueueEmptyException qe){
	        	 System.out.println("exception from catch "+qe.getMessage());
	         }finally {
	                System.out.println("Queue operations completed.");
	         }
	         
	         
		}//sc.close happens here automatically
		
	}
	
}
