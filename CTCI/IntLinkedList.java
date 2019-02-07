import java.util.*;
import java.io.*;

public class IntLinkedList {


//Options for just keeping the head and deleting/inserting other nodes
		private Node head;

		//constructor//initialization of LinkedList Object
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

		//insert item in the back of the LL
		public boolean insertItemB(){
			Node n = new Node();

			Node new_node = new Node();
			new_node = head();
			while(new_node.next != null) {
				new_node = new_node.next;
			}

			n.value = item;
			n.next = null;
			new_node.next = n;
			return true;
		}

		//delete item in the the LinkedList
		public boolean deleteItem(int item){
			if(head.value == item) {
				head = head.next;
				return true;
			}else {
				Node x = head;
				Node y = head.next;
				while(true){
					if(y == null || y.value == item){
						break;
					} else {
						x = y;
						y = y.next;
					}

				}
				if(y != null){
					x.next = y.next;
					return true;
				}else
					return false;

				}
			}
		

		//Bubble sorting alogrithm
		public void sortList(){

			Node a = head.next;
			int c = 0;
			while(a.next != null){
				Node b = head.next;
				while(b.next != null){
					if(b.value < b.next.value)
					{
						c = b.value;
						b.value = b.next.value;
						b.next.value = c;
					}
					b = b.next;
				}
				a = a.next;
			}

		}

		public void printList(){
			Node z = head.next;
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

		//list.deleteItem(5);
		//list.printList();

		//list.sortList;
		//System.out.println;
		//list.printList();



	}


}
