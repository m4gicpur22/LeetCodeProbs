import java.util.*;
import java.io.*;


public class BST{

	class Person {
		private String name;
		private int age;
	}
	//Person Constructor Object
	public Person(String nm, int a){
		name = nm;
		age = a;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int a){
		age = a;
	}

	public String toString(){
		return "\n >> Name: " + name + ", Age: " + age;
	}


	//Root node
	private Node root;

	public BST(){
		root = null;
	}

	public boolean insert(Person item){
		Node n = new node();
		n.data = item;
		n.Lc = null;
		n.Rc = null;

		if(root == null){
			root = n;
			return true;
		}

		Node parent = root;
		Node child = root;

		while(child != null){
			parent = child;
			if(item.getName().compareTo(child.data.getName()) < 0){
				child = child.Lc;
			}
			else {
				child = child.Rc;
			}
		}
		//Reaching the last node
		if(item.getName().compareTo(parent.data.getName()) < 0 {
			parent.Lc = n;
		}
		else {
			parent.Rc = n;
		}

		return true;
	}

	public class Node{
		private Node Lc;
		private Node Rc;
		private Person data;

	}
	//Finds Node in the given tree
	public Node findNode(String Key)
	{
		Node c = root;

		while(c != null){
			if(key.compareTo(c.data.getName()) == 0){
				break;
			}
			if(key.compareTo(c.data.getName()) < 0 ){
				c = c.Lc;
			}
			else {
				c = c.Rc; 
			}
		}

		return c;
	}

	public Node findParent(String key)
	{
		Node parent = root;
		Node child = root;

		do{
			if(key.compareTo(child.data.getName()) == 0){
				break;
			}
			parent = child;
			if(key.compareTo(child.data.getName()) < 0 ){
				child = child.Lc;
			}
			else {
				child = child.Rc; 
			}

		}while(child != null);

		System.out.println(">>" + parent.data.getName());

		if(child != null){
			return parent;
		}else {
			return null;
		}
	}
	//returns value of a node
	public Person getData(Node n){
		return n.data;
	}
	//Recursively naviagtes through the tree to print values, prints starting from parent node
	public void showAll(Node n) {
		Node p = n;
		if(p != null) {
			System.out.println(" " + p.data);
			showAll(p.Lc);
			showAll(p.Rc);
		}
	}

	public static void main(String [] args){

		Person p1 = new Person("Affy", 24);
		Person p2 = new Person("Greg", 3);
		Person p3 = new Person("Louis", 12);
		Person p4 = new Person("Nick", 78);
		Person p5 = new Person("Nate", 56);

		BST bst = new BST();
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.insert(p5);

		bst.showAll(bst.findNode("Nick"));

		Person p = bst.getData(bst.findParent("Affy"));

		System.out.println(p.toString());


	}



}