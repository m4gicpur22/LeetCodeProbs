import java.util.*;
import java.io.*;

public class DoublyLinkedList {


//Options for just keeping the head and deleting/inserting other nodes
		private Node head;

		//constructor//initialization of LinkedList Object
		public DoublyLinkedList(int item){
			head = new Node();
			head.value = item;
			head.next = null;
			head.prev = null;
		}
		//new node becomes head of the list after value is inserted
		public boolean insertItem(int item){

			Node n = new Node();
			n.value = item;
			n.prev = null;
			head.prev = n;
			n.next = null;
			head = n;


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
		}

		public void printList(){
			Node z = head.next;
			while(z != null){
					System.out.println(z.value);
					z = z.next;
			}

		}

		class Node {
			private Node prev;
			private int value;
			private Node next;
		}


	public static void main(String [] args){

		DoublyLinkedList list = new DoublyLinkedList();
		list.insertItem(5);
		list.insertItem(7);
		list.insertItem(4);
		list.printList();
		System.out.println();
		list.deleteItem(4);
		list.printList();

		//list.deleteItem(5);
		//list.printList();

		//list.sortList;
		//System.out.println;
		//list.printList();



	}


}
