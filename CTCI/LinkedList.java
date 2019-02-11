import java.util.*;
import java.io.*;

public class IntLinkedList {

		private Node head;


		public IntLinkedList(int item){
			head = new Node();
			head.value = item;
			head.next = null;
		}
		//new node becomes head of the list after value is inserted
		public boolean insertItem(int item){
			Node n = new Node();
			n.value = item;
			n.next = head;
			head = n;
			return true;
		}

		public void printList(){
			Node z = head;
			while(z != null){
					System.out.println(z.value);
					z = z.next;
			}

		}

		class Node {
			private int value;
			private Node next;
		}


			public static void main(String [] args){

				IntLinkedList list = new IntLinkedList(2);
				list.insertItem(5);
				list.insertItem(7);
				list.insertItem(4);
				list.printList();
			}


}