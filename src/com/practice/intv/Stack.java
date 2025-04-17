package com.practice.intv;
import java.util.EmptyStackException;


public class Stack {
	private Object[] arr;
	private int top;
	
	
	public Stack(int size) {
		arr=new Object[size];
		top=-1;
		
	}
	
	//method to check its empty or not
	public boolean isEmpty() {
		return top==-1;
		
	}
	
	//method to check its full or not
	public boolean isStackFull() {
		return top==arr.length-1;
	}
	
	//method to insert element into stack
	public void push(Object element) {

		if(isStackFull()) {
			throw new StackOverflowError("\nstack is overflow, canot add elemnt");
					
		}	
	
		arr[++top]=element;
		System.out.println("\nElement pushed!!!!");
		
	}
	
	// method to pop element from stack
	public Object pop() {
		if(isEmpty()) { throw new EmptyStackException();}
		System.out.println("\nElemnt poped!!!!");
		return arr[top--];
	}
	
	// method to show top element
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[top];
	}
	
	//method to clear stack
	public void clear() {
		top=-1;
		System.out.println("\nStack cleared!!!!");
	}
	
	public void display() {
		if(isEmpty()) {System.out.println("no elements to display");}
		else
		System.out.println("\nelements in stack");
		for(int i=top; i>=0; i--) {
			System.out.print(arr[i]+", ");
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack(2);
		
		try {
			
			s1.display();
			s1.push("dipak");
			s1.display();
			s1.push(464.64);
			s1.display();
			s1.clear();
			s1.display();
			
		}catch (EmptyStackException e) {
			System.out.println(e.getMessage()+"\n: stack is empty ");
			
		}
		catch (StackOverflowError e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	
		

	}

}
