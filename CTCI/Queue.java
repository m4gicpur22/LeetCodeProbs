import java.util.*;
import java.io.*;

public static class Queue<T> {

	private static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
	

	public QueueNode(T data) {
		this.data = data;
	}

}

private QueueNode<T> first;
private QueueNode last;
//We say that Queues are FIFO or LILO, so that means when we are adding, we must add right after every element in last
//we iniialize first element in queue as well
public void add(T item){
	QueueNode<T> t = new QueueNode<T>(item);
	if(last != null){
		last.next = t;
	}
	last = t;
	if(first == null){
		first = last;
	}
}

public T remove(){
	if(first == null){
		throw new NoSuchElementException();
	}

	T data = first.data;
	first = first.next;
	//if there's one element 
	if(first == null)
		last == null;

	return data;
}

public T peek(){
	if(first == null)
		return first.data;
}

public boolean isEmpty(){
	return first == null;
}

//input 2 in queue
//input 3 in queue
















}