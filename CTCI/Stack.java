import java.util.*;
import java.io.*;

public class Stack<T> {


	private static class StackNode <T> {
		private T data;
		private StackNode<T> next;
	

	public StackNode(T data){
		this.data = data;
	}

	}

private StackNode<T> top;
//Here we are removing the value from the top of the stack
//Top of the stack is set item
//We then move from the top of the stack to the next value below
public T pop(){

	if(top == null)
		throw new EmptyStackException();

	T item = top.data;
	top = top.next;
	return item;

}
//Insertion of new item into Stack
//moves onto the top of stack
public void push(T item){
	StackNode<T> t = new StackNode<T>(item);
	t.next = top;
	top = t;

}
//Shows the top of our stack
 public T peek() {
 	if(top == null)
 		throw new EmptyStackException();
 	return top.data;
 }
//checks if Stack is empty
 public boolean isEmpty() {
 	return top == null;
}

public static void main(String [] args){
}

}