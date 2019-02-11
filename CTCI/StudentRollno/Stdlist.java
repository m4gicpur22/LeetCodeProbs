import java.util*;
import java.io.*;

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