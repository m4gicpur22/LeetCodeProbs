import java.util.*;
import java.io.*;

//Custom HashTable classes
public class Student {

	class student {
		private String name;
		private String roll_no;
		private double cgpa;
	}
	//Constructor of Student Object
	public Student(String name, String roll_no, double cgpa){
		this.name = name;
		this.roll_no = roll_no;
		this.cgpa = cgpa;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRollno(String roll_no){
		this.roll_no = roll_no;
	}

	public String getRollno(){
		return roll_no;
	}

	public void setCGPA(double cgpa){
		this.cgpa = cgpa;
	}

	public double getCPGA(){
		return cgpa;
	}

	public String toString(){
		return "Name: "+name+" Roll no: "+roll_no+" CGPA: "+cgpa; 
	}

}


public class Stdlist {

	private Node h;

	Student newStd = new Student();

	public Stdlist(){
		h = new Node();
		h.next = null;
		h.data = null;
	}

	public boolean insertStd(Student std){

		Node n = new node();
		n.data = std;
		n.next = h.next;
		h.next = n;
		return true
	}

	public boolean haveRollno(String rollno){

		Node a = h.next;
		boolean have = false;
		while( a!= null){
			if(rollno.equals(a.data.newStd.getRollno()))
			{
				have = true;
			}
			a = a.next;
		}
		return have;
	}

	public Student fetchData(String rollno){

		Student data = null;
		Node p = h.next;

		while(p != null){
			if(p.data.newStd.getRollno().equals(rollno)){
				data = p.data;
			}
			p = p.next;
		}
		return data;
	}

	public void deleteStudent(String rollno){

		Node p = h;
		Node q = h.next;

		while(q!= null && !(q.data.newStd.getRollno().equals(rollno))){
			p = q;
			q = q.next;
		}
		if(q != null){
			p.next = q.next;
		} else {

		}
	}

	public void showAll() {

		Node x = h.next;

		while(x != null){
			System.out.println(x.data);
			x.next;
		}
	}


	class Node {

		private Student data;
		private Node next;
	}

}

public class HashTable {

	private StdList[] arr;
	private int size;
	private int totalstudents = 0;

	public HashTable() {
		size = 1000;
		arr = new StdList[size];
	}

	public int toHashCode(String rollno) {

		int addasciis = 0;
		int codeindex = 0;

		for(int i = 0; i < rollno.length(); i++) {
			addasciis = addasciis + (int)rollno.charAt(i);
		}
		codenindex = addasciis % arr.length;
		return codeindex;
	}

	public boolean insert(int key, Student data) {
		if(arr[key] == null){
			arr[key] = new StdList();
		}
		arr[key].insertStd(data);
		totalstudents++;
		return true;
	}

	public int getTotal(){
		return totalstudents;
	}

	public Student fetchStdInfo(String rollno){
		int key = toHashCode(rollno);

		if(arr[key] == null){
			return null;
		}
		else {
			Student q = arr[key].fetchData(rollno);
			if( q != null){
				return q;
			} else {
				return null;
			}
		}
	}

	public boolean deleteStd(String rollno){

		boolean have = arr[toHashCode(rollno)].haveRollno(rollno);

		if(have) {
			int key = toHashCode(rollno);
			arr[key].deleteStudent(rollno);
			totalstudent--;
			return true;
		}
		return false;
	}

	public void showData() {
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != null){
				arr[i].showAll();
			}
		}
	}


}

public class Main {

	public static void main(String [] args) {
		HashTable HashTable = new HashTable();
		
		Student std1 = new Student("Affy", "15-123", 3.5);
		Student std2 = new Student("Drake", "15-124", 3.1);	
		Student std3 = new Student("Bosh", "15-125", 3.3);
		Student std4 = new Student("Charles", "15-321", 3.9);

		int std1key = hashtable.toHashCode(std1.getRollno());
		int std2key = hashtable.toHashCode(std2.getRollno());
		int std3key = hashtable.toHashCode(std3.getRollno());
		int std4key = hashtable.toHashCode(std3.getRollno());

		hashtable.insert(std1key, std1);
		hashtable.insert(std2key, std2);
		hashtable.insert(std3key, std3);
		hashtable.insert(std3key, std4);

		hashtable.deleteStd(std3.getRollno());

		Student new_std2 = hashtable.fetchStdInfo(std2.getRollno());
		if(new_std2.getName().equals(std2.getName())) {
			System.out.println("Equal");
		}

		hashtable.showData();	
	}
}

