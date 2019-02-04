import java.util.*;
import java.io.*;

public class Queue {
	//enqueue and dequeue functions
	//front and rear functions

	private int [] q;
	private int size;
	private int total;
	private int front;
	private int rear;


	public Queue(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[this.size];
	}

	public boolean enqueue(int item){
		if(isFull()){
			return false;
		}
		else {
			total++;
			q[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}

	}

	public int dequeue() {
		int item = q[front];
		total--;
		front = (front + 1)% size;
		return item;
	}

	public boolean isFull(){
		if(size == total)
			return true;
		else
			return false;
	}

	public void printoutqueue() {

		int f = front;

		if(total != 0){
			for(int i = 0; i < total; i++){
				System.out.println(" " + q[f]);
				f = (f+1) % size;
			}
		}

	}

	public static void main(String [] args){

			Queue q1 = new Queue();
			q1.enqueue(3);
			q1.enqueue(4);
			q1.enqueue(5);

			q1.printoutqueue();
	}

	}
		

